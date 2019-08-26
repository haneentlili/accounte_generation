package org.sid.Services;


import java.util.Collection;
import java.util.List;

import org.sid.Controller.ClientController;
import org.sid.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestService {
	@Autowired
private ClientController clientController;
	
@RequestMapping(value="/clients",method=RequestMethod.POST)
@ResponseBody	
public Client saveClient(@RequestBody Client c) {
	System.out.println(c.toString());
		return clientController.saveClient(c);
	}

@RequestMapping(value="/clients",method=RequestMethod.GET)
	public Collection<Client> listClient() {
		return clientController.listClient();
	}
}
