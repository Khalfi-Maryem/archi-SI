package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Maintenance;

public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
