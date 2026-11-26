package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Contrat;

public interface IContratRepository extends JpaRepository<Contrat, Long> {
}
