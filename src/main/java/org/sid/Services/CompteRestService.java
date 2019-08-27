package org.sid.Services;

import java.util.List;

import org.sid.Controller.CompteController;
import org.sid.Entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CompteRestService {
	@Autowired
CompteController compteController;
	
	@RequestMapping(value="/comptesave",method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin

	public Compte saveCompte(@RequestBody Compte cp) {
		System.out.println(cp.toString());
		return compteController.saveCompte(cp);
	}
	@RequestMapping(value="/comptefind/{code}",method=RequestMethod.GET)
	@CrossOrigin
	public Compte getCompte(@PathVariable long code) {
		return compteController.getCompte(code);
	}
}
