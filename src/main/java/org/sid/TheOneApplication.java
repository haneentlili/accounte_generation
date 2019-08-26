package org.sid;



import java.sql.Date;

import org.sid.DAO.ClientRepository;
import org.sid.DAO.CompteRepository;
import org.sid.DAO.OperationRepository;
import org.sid.Entities.Client;
import org.sid.Entities.Compte;
import org.sid.Entities.CompteCourante;
import org.sid.Entities.Operation;
import org.sid.Entities.Versement;
import org.sid.Services.Theimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheOneApplication implements CommandLineRunner{
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired 
	private Theimplementation theimplementation;
	public static void main(String[] args) {
		SpringApplication.run(TheOneApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		long n=9;
		double d=90;
		Date d1= new Date(System.currentTimeMillis());
		//Client c1=clientRepository.save(new Client(n,"haneen"));
		//Client c2=clientRepository.save(new Client(n,"lou"));
		//Compte cp1 = compteRepository.save(new CompteCourante(n,15000,c1,d));
		//Operation op =operationRepository.save(new Versement(n,d1, d, cp1));
		//System.out.println("here"+compteRepository.findById((long) 11).get());
		//theimplementation.verser((long) 10,d );
	//	theimplementation.retirer((long) 11,d );
	//theimplementation.virement((long) 13, (long) 10, (double) 200);

		
	}
	
}
