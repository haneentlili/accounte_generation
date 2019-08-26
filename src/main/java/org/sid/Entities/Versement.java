package org.sid.Entities;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Long numeroOperation, Date dateOperation, double montant, Compte compte) {
		super(numeroOperation, dateOperation, montant, compte);
		// TODO Auto-generated constructor stub

	}

}
