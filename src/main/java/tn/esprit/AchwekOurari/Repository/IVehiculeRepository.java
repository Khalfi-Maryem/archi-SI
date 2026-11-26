package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.CategorieVehicule;
import tn.esprit.AchwekOurari.entity.Vehicule;

import java.math.BigDecimal;
import java.util.List;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
    List<Vehicule> findByCategorie(CategorieVehicule categorie);
    List<Vehicule> findByCategorieAndTarifJournalierBetween(CategorieVehicule categorie, BigDecimal min , BigDecimal max);

}
