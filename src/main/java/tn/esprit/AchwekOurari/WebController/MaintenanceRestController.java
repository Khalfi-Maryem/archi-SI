package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IMaintenanceServices;
import tn.esprit.AchwekOurari.WebController.dto.MaintenanceDTO;
import tn.esprit.AchwekOurari.entity.Maintenance;

import java.util.List;

@Tag(name = "Gestion des Maintenances", description = "Web Services REST pour le suivi de maintenance des véhicules")
@RestController
@RequestMapping("/maintenances")
@RequiredArgsConstructor
public class MaintenanceRestController {

    private final IMaintenanceServices iMaintenanceServices;

    @Operation(summary = "Planifier une maintenance", description = "Permet d'ajouter une opération de maintenance pour un véhicule")
    @PostMapping("/add")
    public Maintenance create(@RequestBody Maintenance maintenance) {
        return iMaintenanceServices.add(maintenance);
    }

    @Operation(summary = "Récupérer une maintenance par ID", description = "Retourne les détails d'une opération de maintenance spécifique")
    @GetMapping("/get/{id}")
    public MaintenanceDTO getById(@PathVariable Long id) {
        return iMaintenanceServices.getById(id);
    }

    @Operation(summary = "Récupérer toutes les maintenances", description = "Retourne l'historique complet de toutes les opérations de maintenance")
    @GetMapping("/all")
    public List<Maintenance> getAll() {
        return iMaintenanceServices.getAll();
    }

    @Operation(summary = "Mettre à jour une maintenance", description = "Permet de mettre à jour les détails d'une maintenance existante")
    @PutMapping("/update")
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return iMaintenanceServices.update(maintenance);
    }

    @Operation(summary = "Supprimer une maintenance par ID", description = "Permet de supprimer une maintenance via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iMaintenanceServices.deleteById(id);
    }
}
