package org.sid.Controller;

import java.sql.Date;
import java.util.Collection;
import java.util.stream.Collectors;

import org.sid.DAO.CompteRepository;
import org.sid.DAO.OperationRepository;
import org.sid.Entities.Compte;
import org.sid.Entities.Operation;
import org.sid.Entities.Retrait;
import org.sid.Entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class OperationControllerImp implements OperationController{
	@Autowired
	private OperationController operationController;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired 
	private OperationRepository operationRepository;
	@Override
	@Transactional
public boolean verser(long code, double montant) {
		Compte cp = compteRepository.findById(code).get();
		Operation o = new Versement();
		o.setDateOperation(new Date(System.currentTimeMillis()));
		o.setMontant(montant);
		o.setCompte(cp);
		operationRepository.save(o);
		double mo= cp.getSolde()+montant;
		cp.setSolde((float)mo);
		compteRepository.save(cp);
		return true;
	}

	@Override
	@Transactional
	public boolean retirer(long code, double montant) {
		Compte cp = compteRepository.findById(code).get();
		if(cp.getSolde()<montant) throw new RuntimeException("Solde insuffisant");
		Operation o = new Retrait ();
		o.setDateOperation(new Date(System.currentTimeMillis()));
		o.setMontant(montant);
		o.setCompte(cp);
		operationRepository.save(o);
		double mo= cp.getSolde()-montant;
		cp.setSolde((float)mo);
		compteRepository.save(cp);
		return true;
	}

	@Override
	@Transactional
	public boolean virement(long code1, long code2, long montant) {
		retirer(code1,montant);
		verser(code2,montant);
		return false;
	}

	@Override
	public Collection<Operation> listOperation() {
		// TODO Auto-generated method stub
		return operationRepository.findAll().stream().collect(Collectors.toList());

	}

}
