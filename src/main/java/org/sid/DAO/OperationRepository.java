package org.sid.DAO;



import org.sid.Entities.Operation;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

public interface OperationRepository extends JpaRepository<Operation, Long>{
	


}
