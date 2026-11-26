package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Equipement;

import java.util.List;

public interface IEquipementServices {
    Equipement getById(Long id);
    Equipement add(Equipement equipement);
    Equipement update(Equipement equipement);
    void deleteById(Long id);
    List<Equipement> getAll();
}
