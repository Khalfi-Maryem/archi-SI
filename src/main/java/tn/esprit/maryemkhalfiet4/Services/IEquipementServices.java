package tn.esprit.maryemkhalfiet4.Services;

import tn.esprit.maryemkhalfiet4.entity.Equipement;

import java.util.List;

public interface IEquipementServices {
    Equipement getById(Long id);
    Equipement add(Equipement equipement);
    Equipement update(Equipement equipement);
    void deleteById(Long id);
    List<Equipement> getAll();
}
