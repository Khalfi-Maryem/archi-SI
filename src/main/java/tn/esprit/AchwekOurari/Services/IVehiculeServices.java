package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.CategorieVehicule;
import tn.esprit.AchwekOurari.entity.Vehicule;

import java.util.List;

public interface IVehiculeServices {
    Vehicule getById(Long id);
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void deleteById(Long id);
    List<Vehicule> getAll();
    Vehicule assignToAgence(Long idVehicule,Long idAgence);
    Vehicule assignToEquipements(Long idVehicule, Long idEquipemnts);
    Vehicule UnassignToAgence(Long idVehicule,Long idAgence);
    Vehicule UnassignToEquipements(Long idVehicule, Long idEquipemnts);

    Vehicule addVehiculeAndAssignToAgence(Vehicule vehicule, Long idAgence);
    List<Vehicule> getAllByCategorie(CategorieVehicule categorie);

    List<Vehicule> getAllBycategorie(CategorieVehicule categorie);
}
