package tn.esprit.maryemkhalfiet4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.maryemkhalfiet4.entity.Contrat;

public interface IContratRepository extends JpaRepository<Contrat, Long> {
}
