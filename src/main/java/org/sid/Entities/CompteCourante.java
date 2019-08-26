package org.sid.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourante extends Compte {
	private double decouvert;

	public CompteCourante(Long codeCompte, float solde, Client client, double decouvert) {
		super(codeCompte, solde, client);
		this.decouvert = decouvert;
	}

	public CompteCourante() {
		super();
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
