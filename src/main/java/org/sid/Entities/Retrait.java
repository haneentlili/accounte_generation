package org.sid.Entities;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Long numeroOperation, Date dateOperation, double montant, Compte compte) {
		super(numeroOperation, dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

}
