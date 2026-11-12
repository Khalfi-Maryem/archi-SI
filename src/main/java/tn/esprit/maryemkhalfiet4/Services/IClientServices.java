package tn.esprit.maryemkhalfiet4.Services;

import tn.esprit.maryemkhalfiet4.entity.Client;

import java.util.List;

public interface IClientServices {
    Client getById(Long id);
    Client add(Client client);
    Client update(Client client);
    void deleteById(Long id);
    List<Client> getAll();
}