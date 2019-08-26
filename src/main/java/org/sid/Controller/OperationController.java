package org.sid.Controller;

import java.util.Collection;

import org.sid.Entities.Operation;
import org.sid.Entities.Versement;
import org.springframework.stereotype.Component;

@Component
public interface OperationController {
public boolean verser(long code , double montant);
public boolean retirer(long code, double montant);
public boolean virement(long code1, long code2,long montant);
public Collection<Operation> listOperation();
}
