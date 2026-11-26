package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Contrat;

import java.util.List;

public interface IContratServices {
    Contrat getById(Long id);
    Contrat add(Contrat contrat);
    Contrat update(Contrat contrat);
    void deleteById(Long id);
    List<Contrat> getAll();
}
