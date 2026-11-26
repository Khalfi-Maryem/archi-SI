package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}
