package org.sid.Controller;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.sid.DAO.ClientRepository;
import org.sid.DAO.CompteRepository;
import org.sid.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class ClientControllerImp implements ClientController{
    @Autowired
	private ClientRepository clientRepository;
	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}
/*
	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}*/


@Override
public Collection<Client> listClient() {
	// TODO Auto-generated method stub
	return clientRepository.findAll().stream().collect(Collectors.toList());
}}