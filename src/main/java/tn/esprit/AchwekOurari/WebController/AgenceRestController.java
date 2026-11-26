package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IAgenceServices;
import tn.esprit.AchwekOurari.entity.Agence;

import java.util.List;

@Tag(name = "Gestion des Agences", description = "Web Services REST pour la gestion des agences")
@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceRestController {

    private final IAgenceServices iAgenceServices;

    @Operation(summary = "Ajouter une nouvelle agence", description = "Permet d'ajouter une agence dans la base de données")
    @PostMapping("/add")
    public Agence create(@RequestBody Agence agence) {
        return iAgenceServices.add(agence);
    }

    @Operation(summary = "Récupérer une agence par ID", description = "Retourne les détails d'une agence via son identifiant")
    @GetMapping("/get/{id}")
    public Agence getById(@PathVariable Long id) {
        return iAgenceServices.getById(id);
    }

    @Operation(summary = "Récupérer toutes les agences", description = "Retourne la liste complète de toutes les agences")
    @GetMapping("/all")
    public List<Agence> getAll() {
        return iAgenceServices.getAll();
    }

    @Operation(summary = "Mettre à jour une agence", description = "Permet de modifier les informations d'une agence existante")
    @PutMapping("/update")
    public Agence update(@RequestBody Agence agence) {
        return iAgenceServices.update(agence);
    }

    @Operation(summary = "Supprimer une agence par ID", description = "Permet de supprimer une agence via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iAgenceServices.deleteById(id);
    }
}
