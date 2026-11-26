package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Paiement;

import java.util.List;

public interface IPaiementServices {
    Paiement getById(Long id);
    Paiement add(Paiement paiement);
    Paiement update(Paiement paiement);
    void deleteById(Long id);
    List<Paiement> getAll();
}
