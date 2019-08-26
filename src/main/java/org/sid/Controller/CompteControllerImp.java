package org.sid.Controller;

import java.util.Collection;
import java.util.List;

import org.sid.DAO.CompteRepository;
import org.sid.Entities.Compte;
import org.sid.Entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompteControllerImp implements CompteController{
	@Autowired 
	CompteRepository compteRepository;
	@Override
	public Compte saveCompte(Compte cp) {
		
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(long code) {
		
		return compteRepository.findById(code).get();
	}

	

}
