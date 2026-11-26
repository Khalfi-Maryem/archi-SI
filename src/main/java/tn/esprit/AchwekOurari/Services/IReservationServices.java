package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationServices {
    Reservation getById(Long id);
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    void deleteById(Long id);
    List<Reservation> getAll();
    List<Reservation> afficherReservationsParDate(LocalDate date);
}
