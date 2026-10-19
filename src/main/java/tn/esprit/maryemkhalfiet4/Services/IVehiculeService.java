package tn.esprit.maryemkhalfiet4.Services;

import tn.esprit.maryemkhalfiet4.entity.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule getById(Long id);
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void deleteById(Long id);


}
