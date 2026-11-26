package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IReservationServices;
import tn.esprit.AchwekOurari.entity.Reservation;

import java.util.List;

@Tag(name = "Gestion des Réservations", description = "Web Services REST pour la gestion des réservations")
@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationRestController {

    private final IReservationServices iReservationServices;

    @Operation(summary = "Créer une nouvelle réservation", description = "Permet d'enregistrer une réservation de véhicule")
    @PostMapping("/add")
    public Reservation create(@RequestBody Reservation reservation) {
        return iReservationServices.add(reservation);
    }

    @Operation(summary = "Récupérer une réservation par ID", description = "Retourne les détails d'une réservation spécifique")
    @GetMapping("/get/{id}")
    public Reservation getById(@PathVariable Long id) {
        return iReservationServices.getById(id);
    }

    @Operation(summary = "Récupérer toutes les réservations", description = "Retourne la liste complète de toutes les réservations")
    @GetMapping("/all")
    public List<Reservation> getAll() {
        return iReservationServices.getAll();
    }

    @Operation(summary = "Mettre à jour une réservation", description = "Permet de mettre à jour les données d'une réservation existante")
    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation) {
        return iReservationServices.update(reservation);
    }

    @Operation(summary = "Supprimer une réservation par ID", description = "Permet de supprimer une réservation via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iReservationServices.deleteById(id);
    }
}
