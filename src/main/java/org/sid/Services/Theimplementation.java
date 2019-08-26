package org.sid.Services;
import java.sql.Date;

import org.sid.DAO.CompteRepository;
import org.sid.DAO.OperationRepository;
import org.sid.Entities.Compte;
import org.sid.Entities.CompteCourante;
import org.sid.Entities.Retrait;
import org.sid.Entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Theimplementation implements Theinterface {
	
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;
	
	@Override
	public Compte consulterCompte(Long codeCompte) {
		Compte obj = compteRepository.findById(codeCompte).get();
		if(obj==null) throw new RuntimeException("Compte introuvable");
		return obj;
	}

	@Override
	public void verser(Long codeCompte, double montant) {
		Compte cp = consulterCompte(codeCompte);
		Date d1 = new Date(System.currentTimeMillis());
		Versement v = new Versement((long)100,d1,montant,cp);
		float f = cp.getSolde()+(float)montant;
		cp.setSolde(f);
		operationRepository.save(v);
		compteRepository.save(cp);

	}

	@Override
	public void retirer(Long codeCompte, double montant) {
		Compte cp = consulterCompte(codeCompte);
		double facility=0;
		if(cp instanceof CompteCourante) {
			facility =((CompteCourante) cp).getDecouvert();
			if(cp.getSolde()+facility<montant) {
				throw new RuntimeException("Solde insuffisant");
			}
		}
		Date d = new Date(System.currentTimeMillis());
		int l=10;
		Retrait r = new Retrait((long)l,d,montant,cp);
		float f = cp.getSolde()-(float)montant;
		cp.setSolde(f);
		operationRepository.save(r);
		compteRepository.save(cp);


	}

	@Override
	public void virement(Long codeCompte1, Long codeCompte2, double montant) {
		retirer(codeCompte2,montant);
		verser(codeCompte1,montant);

	}

	

	

}
