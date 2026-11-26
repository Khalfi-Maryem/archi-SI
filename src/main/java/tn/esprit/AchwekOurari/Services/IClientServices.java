package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Client;

import java.util.List;

public interface IClientServices {
    Client getById(Long id);
    Client add(Client client);
    Client update(Client client);
    void deleteById(Long id);
    List<Client> getAll();
}
