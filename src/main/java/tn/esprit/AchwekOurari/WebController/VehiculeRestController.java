package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IVehiculeServices;
import tn.esprit.AchwekOurari.entity.CategorieVehicule;
import tn.esprit.AchwekOurari.entity.Vehicule;

import java.math.BigDecimal;
import java.util.List;

@Tag(name = "Gestion des Véhicules", description = "Web Services REST pour la gestion du parc automobile")
@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {

    private final IVehiculeServices iVehiculeServices;

    @Operation(summary = "Ajouter un nouveau véhicule", description = "Permet d'enregistrer un véhicule dans le parc automobile")
    @PostMapping("/add")
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return iVehiculeServices.add(vehicule);
    }

    @Operation(summary = "Récupérer un véhicule par ID", description = "Retourne les caractéristiques d'un véhicule spécifique")
    @GetMapping("/get/{id}")
    public Vehicule getById(@PathVariable Long id) {
        return iVehiculeServices.getById(id);
    }

    @Operation(summary = "Récupérer tous les véhicules", description = "Retourne la liste complète de tous les véhicules du parc")
    @GetMapping("/all")
    public List<Vehicule> getAll() {
        return iVehiculeServices.getAll();
    }

    @Operation(summary = "Mettre à jour un véhicule", description = "Permet de mettre à jour les informations d'un véhicule existant")
    @PutMapping("/update")
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return iVehiculeServices.update(vehicule);
    }

    @Operation(summary = "Supprimer un véhicule par ID", description = "Permet de supprimer un véhicule du parc via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iVehiculeServices.deleteById(id);
    }
    @PutMapping("/{idVehicule}/{idAgence}")
    Vehicule assignToAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return iVehiculeServices.assignToAgence(idVehicule, idAgence);
    }
    @PutMapping("/assignToEquipements/{idVehicule}/{idEquipement}")
    Vehicule assignToEquipements(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {

        return iVehiculeServices.assignToEquipements(idVehicule, idEquipement);

    }
    @PutMapping("unassignToAgence/{idVehicule}/{idAgence}")
      Vehicule UnassignToAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence)
    {
        return iVehiculeServices.UnassignToAgence(idVehicule,idAgence);
    }
    @PutMapping("/unassignToEquipements/{idVehicule}/{idEquipement}")
    Vehicule UnassignToEquipements(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {

        return iVehiculeServices.UnassignToEquipements(idVehicule, idEquipement);

    }
    @PostMapping("/addVehiculeAndAssignToAgence/{idAgence}")
    Vehicule addVehicule(@RequestBody Vehicule vehicule, @PathVariable Long idAgence)
    {
        return iVehiculeServices.addVehiculeAndAssignToAgence(vehicule,idAgence);
    }

    @GetMapping("listbycategorie/{categorie}")
    List<Vehicule> afficherVehicule(@PathVariable CategorieVehicule categorie){
        return iVehiculeServices.getAllBycategorie(categorie);
    }

    @GetMapping("listbycategorieAndTarif/{categorie}/{min}/{max}")
    List<Vehicule> afficherVehiculeParTarif(@PathVariable CategorieVehicule categorie, @PathVariable BigDecimal min, @PathVariable BigDecimal max){
        return iVehiculeServices.getAllByCategorieAndTarif(categorie, min, max);
    }
}
