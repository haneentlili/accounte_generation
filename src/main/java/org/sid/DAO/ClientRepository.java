package org.sid.DAO;

import org.sid.Entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long>{
	

}
