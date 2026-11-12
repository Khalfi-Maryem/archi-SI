package tn.esprit.maryemkhalfiet4.Services;

import tn.esprit.maryemkhalfiet4.entity.Reservation;

import java.util.List;

public interface IReservationServices {
    Reservation getById(Long id);
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    void deleteById(Long id);
    List<Reservation> getAll();
}
