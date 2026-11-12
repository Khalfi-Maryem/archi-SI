package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IReservationServices;
import tn.esprit.maryemkhalfiet4.entity.Vehicule;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {

    private final IReservationServices iVehiculeServices;

    @PostMapping("/add")
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return iVehiculeServices.add(vehicule);
    }

    @GetMapping("/get/{id}")
    public Vehicule getById(@PathVariable Long id) {
        return iVehiculeServices.getById(id);
    }

    @GetMapping("/all")
    public List<Vehicule> getAll() {
        return iVehiculeServices.getAll();
    }

    @PutMapping("/update")
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return iVehiculeServices.update(vehicule);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iVehiculeServices.deleteById(id);
    }
}