package org.sid.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
	private double taux;

	public CompteEpargne(Long codeCompte, float solde, Client client, double taux) {
		super(codeCompte, solde, client);
		this.taux = taux;
	}

	public CompteEpargne() {
		super();
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
