package tn.esprit.maryemkhalfiet4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.maryemkhalfiet4.entity.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long > {
}
