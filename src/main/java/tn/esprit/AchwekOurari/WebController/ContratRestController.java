package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IContratServices;
import tn.esprit.AchwekOurari.entity.Contrat;

import java.util.List;

@Tag(name = "Gestion des Contrats", description = "Web Services REST pour la gestion des contrats de location")
@RestController
@RequestMapping("/contrats")
@RequiredArgsConstructor
public class ContratRestController {

    private final IContratServices iContratServices;

    @Operation(summary = "Créer un nouveau contrat", description = "Permet d'enregistrer un contrat dans la base de données")
    @PostMapping("/add")
    public Contrat create(@RequestBody Contrat contrat) {
        return iContratServices.add(contrat);
    }

    @Operation(summary = "Récupérer un contrat par ID", description = "Retourne les informations d'un contrat spécifique")
    @GetMapping("/get/{id}")
    public Contrat getById(@PathVariable Long id) {
        return iContratServices.getById(id);
    }

    @Operation(summary = "Récupérer tous les contrats", description = "Retourne la liste complète de tous les contrats")
    @GetMapping("/all")
    public List<Contrat> getAll() {
        return iContratServices.getAll();
    }

    @Operation(summary = "Mettre à jour un contrat", description = "Permet de mettre à jour un contrat existant")
    @PutMapping("/update")
    public Contrat update(@RequestBody Contrat contrat) {
        return iContratServices.update(contrat);
    }

    @Operation(summary = "Supprimer un contrat par ID", description = "Permet de supprimer un contrat via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iContratServices.deleteById(id);
    }
}
