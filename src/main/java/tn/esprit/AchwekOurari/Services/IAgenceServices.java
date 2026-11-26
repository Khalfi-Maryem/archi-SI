package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Agence;

import java.util.List;

public interface IAgenceServices {
    Agence getById(Long id);
    Agence add(Agence agence);
    Agence update(Agence agence);
    void deleteById(Long id);
    List<Agence> getAll();
}
