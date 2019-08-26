package org.sid.Services;

import java.util.Collection;

import org.sid.Controller.OperationController;
import org.sid.Entities.Operation;
import org.sid.Entities.Versement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestService {
@Autowired
private OperationController operationController;
@RequestMapping(value="/operations",method=RequestMethod.GET)
public Collection<Operation> listOperation() {
	return operationController.listOperation();
}

@RequestMapping(value="/versement",method=RequestMethod.PUT)
public boolean verser(
	@RequestParam long code,
	@RequestParam double montant) {
	return operationController.verser(code, montant);
}
@RequestMapping(value="/retrait",method=RequestMethod.PUT)
public boolean retirer(
		@RequestParam long code,
		@RequestParam double montant) {
	return operationController.retirer(code, montant);
}
@RequestMapping(value="/virement",method=RequestMethod.PUT)
public boolean virement(@RequestParam long code1,
		@RequestParam long code2,
		@RequestParam long montant) {
	return operationController.virement(code1, code2, montant);
}

}
