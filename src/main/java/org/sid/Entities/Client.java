package org.sid.Entities;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import javax.persistence.Id;


@Entity
public class Client implements Serializable {
	
	@Id
	@GeneratedValue
	private Long codeClient;
	private String nomClient;
	
	//@OneToMany(mappedBy="client")
	//private Collection<Compte> comptes;
	
	

	public Client() {
		super();
	}



	public Client(Long codeClient, String nomClient) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
	}



	public Long getCodeClient() {
		return codeClient;
	}



	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}



	public String getNomClient() {
		return nomClient;
	}



	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}



	/*public Collection<Compte> getComptes() {
		return comptes;
	}



	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	*/
	
	
	

}
