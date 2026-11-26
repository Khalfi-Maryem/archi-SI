package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Equipement;

public interface IEquipementRepository extends JpaRepository<Equipement, Long> {
}
