package tn.esprit.maryemkhalfiet4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.maryemkhalfiet4.Services.IReservationServices;
import tn.esprit.maryemkhalfiet4.entity.Reservation;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationServices {

    private final IReservationRepository iReservationRepository;

    @Override
    public Reservation getById(Long id) {
        return iReservationRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("reservation not found"));
    }

    @Override
    public Reservation add(Reservation reservation) {
        return iReservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return iReservationRepository.save(reservation);
    }

    @Override
    public void deleteById(Long id) {
        iReservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getAll() {
        return iReservationRepository.findAll();
    }
}