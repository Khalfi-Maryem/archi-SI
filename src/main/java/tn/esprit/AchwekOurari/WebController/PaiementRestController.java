package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IPaiementServices;
import tn.esprit.AchwekOurari.entity.Paiement;

import java.util.List;

@Tag(name = "Gestion des Paiements", description = "Web Services REST pour la gestion des paiements")
@RestController
@RequestMapping("/paiements")
@RequiredArgsConstructor
public class PaiementRestController {

    private final IPaiementServices iPaiementServices;

    @Operation(summary = "Enregistrer un nouveau paiement", description = "Permet d'enregistrer un paiement pour un contrat")
    @PostMapping("/add")
    public Paiement create(@RequestBody Paiement paiement) {
        return iPaiementServices.add(paiement);
    }

    @Operation(summary = "Récupérer un paiement par ID", description = "Retourne les détails d'un paiement spécifique via son identifiant")
    @GetMapping("/get/{id}")
    public Paiement getById(@PathVariable Long id) {
        return iPaiementServices.getById(id);
    }

    @Operation(summary = "Récupérer tous les paiements", description = "Retourne la liste complète de tous les paiements enregistrés")
    @GetMapping("/all")
    public List<Paiement> getAll() {
        return iPaiementServices.getAll();
    }

    @Operation(summary = "Mettre à jour un paiement", description = "Permet de modifier les informations d'un paiement existant")
    @PutMapping("/update")
    public Paiement update(@RequestBody Paiement paiement) {
        return iPaiementServices.update(paiement);
    }

    @Operation(summary = "Supprimer un paiement par ID", description = "Permet de supprimer un paiement via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iPaiementServices.deleteById(id);
    }
}
