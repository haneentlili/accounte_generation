package org.sid.Controller;

import java.util.Collection;
import java.util.List;


import org.sid.Entities.Client;
import org.springframework.stereotype.Component;


@Component
public interface ClientController {
public Client saveClient(Client c);
public Collection<Client> listClient();

}
