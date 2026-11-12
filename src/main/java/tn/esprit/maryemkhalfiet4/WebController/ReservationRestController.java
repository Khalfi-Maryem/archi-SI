package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IReservationServices;
import tn.esprit.maryemkhalfiet4.entity.Reservation;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationRestController {

    private final IReservationServices iReservationServices;

    @PostMapping("/add")
    public Reservation create(@RequestBody Reservation reservation) {
        return iReservationServices.add(reservation);
    }

    @GetMapping("/get/{id}")
    public Reservation getById(@PathVariable Long id) {
        return iReservationServices.getById(id);
    }

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return iReservationServices.getAll();
    }

    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation) {
        return iReservationServices.update(reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iReservationServices.deleteById(id);
    }
}