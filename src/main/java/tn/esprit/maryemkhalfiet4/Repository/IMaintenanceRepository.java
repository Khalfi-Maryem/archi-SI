package tn.esprit.maryemkhalfiet4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.maryemkhalfiet4.entity.Maintenance;

public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
