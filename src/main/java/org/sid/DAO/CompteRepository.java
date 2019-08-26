package org.sid.DAO;
import org.sid.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//@Repository
public interface CompteRepository extends JpaRepository<Compte, Long>{
}
