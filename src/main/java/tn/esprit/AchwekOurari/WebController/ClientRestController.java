package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IClientServices;
import tn.esprit.AchwekOurari.entity.Client;

import java.util.List;

@Tag(name = "Gestion des Clients", description = "Web Services REST pour la gestion des clients")
@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientRestController {

    private final IClientServices iClientServices;

    @Operation(summary = "Ajouter un nouveau client", description = "Permet d'enregistrer un client dans la base de données")
    @PostMapping("/add")
    public Client create(@RequestBody Client client) {
        return iClientServices.add(client);
    }

    @Operation(summary = "Récupérer un client par ID", description = "Retourne les détails d'un client via son identifiant")
    @GetMapping("/get/{id}")
    public Client getById(@PathVariable Long id) {
        return iClientServices.getById(id);
    }

    @Operation(summary = "Récupérer tous les clients", description = "Retourne la liste complète de tous les clients")
    @GetMapping("/all")
    public List<Client> getAll() {
        return iClientServices.getAll();
    }

    @Operation(summary = "Mettre à jour un client", description = "Permet de modifier les informations d'un client existant")
    @PutMapping("/update")
    public Client update(@RequestBody Client client) {
        return iClientServices.update(client);
    }

    @Operation(summary = "Supprimer un client par ID", description = "Permet de supprimer un client via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iClientServices.deleteById(id);
    }
}
