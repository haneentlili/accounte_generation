package org.sid.Services;

import org.sid.Entities.Compte;


public interface Theinterface {
	public Compte consulterCompte(Long codeCompte);
	public void verser(Long codeCompte, double montant);
	public void retirer(Long codeCompte, double montant);
	public void virement(Long codeCompte1,Long codeCompte2,double montant);
	//public Page<Operation> listeOperation (Long codeCompte,int page,int size);
}
