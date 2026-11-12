package tn.esprit.maryemkhalfiet4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.maryemkhalfiet4.entity.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> {
}
