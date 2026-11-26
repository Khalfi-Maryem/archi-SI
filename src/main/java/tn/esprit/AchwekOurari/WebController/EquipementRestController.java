package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IEquipementServices;
import tn.esprit.AchwekOurari.entity.Equipement;

import java.util.List;

@Tag(name = "Gestion des Équipements", description = "Web Services REST pour la gestion des équipements des véhicules")
@RestController
@RequestMapping("/equipements")
@RequiredArgsConstructor
public class EquipementRestController {

    private final IEquipementServices iEquipementServices;

    @Operation(summary = "Ajouter un nouvel équipement", description = "Permet d'enregistrer un équipement dans la base de données")
    @PostMapping("/add")
    public Equipement create(@RequestBody Equipement equipement) {
        return iEquipementServices.add(equipement);
    }

    @Operation(summary = "Récupérer un équipement par ID", description = "Retourne les détails d'un équipement spécifique")
    @GetMapping("/get/{id}")
    public Equipement getById(@PathVariable Long id) {
        return iEquipementServices.getById(id);
    }

    @Operation(summary = "Récupérer tous les équipements", description = "Retourne la liste de tous les équipements")
    @GetMapping("/all")
    public List<Equipement> getAll() {
        return iEquipementServices.getAll();
    }

    @Operation(summary = "Mettre à jour un équipement", description = "Permet de modifier un équipement existant")
    @PutMapping("/update")
    public Equipement update(@RequestBody Equipement equipement) {
        return iEquipementServices.update(equipement);
    }

    @Operation(summary = "Supprimer un équipement par ID", description = "Permet de supprimer un équipement via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iEquipementServices.deleteById(id);
    }
}
