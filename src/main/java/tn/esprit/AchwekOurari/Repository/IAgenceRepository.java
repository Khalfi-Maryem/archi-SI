package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Agence;

public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}
