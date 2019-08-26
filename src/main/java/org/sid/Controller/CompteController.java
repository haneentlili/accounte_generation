package org.sid.Controller;

import java.util.Collection;
import java.util.List;

import org.sid.Entities.Client;
import org.sid.Entities.Compte;
import org.sid.Entities.Operation;
import org.springframework.stereotype.Component;
@Component
public interface CompteController {
public Compte saveCompte(Compte cp);
public Compte getCompte(long code);


}
