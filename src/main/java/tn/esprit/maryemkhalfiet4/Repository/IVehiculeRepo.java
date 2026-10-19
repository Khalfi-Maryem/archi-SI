package tn.esprit.maryemkhalfiet4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.maryemkhalfiet4.entity.Vehicule;

public interface IVehiculeRepo extends JpaRepository<Vehicule, Long > {
}
