package tn.esprit.AchwekOurari.WebController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AchwekOurari.Services.IEmployeeServices;
import tn.esprit.AchwekOurari.entity.Employee;

import java.util.List;

@Tag(name = "Gestion des Employés", description = "Web Services REST pour la gestion des employés")
@RestController
@RequestMapping({"/employees", "/employes"})
@RequiredArgsConstructor
public class EmployeeRestController {

    private final IEmployeeServices iEmployeeServices;

    @Operation(summary = "Ajouter un nouvel employé", description = "Permet d'ajouter un employé dans la base de données")
    @PostMapping("/add")
    public Employee create(@RequestBody Employee employee) {
        return iEmployeeServices.add(employee);
    }

    @Operation(summary = "Récupérer un employé par ID", description = "Retourne les informations d'un employé via son identifiant")
    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable Long id) {
        return iEmployeeServices.getById(id);
    }

    @Operation(summary = "Récupérer tous les employés", description = "Retourne la liste complète de tous les employés")
    @GetMapping("/all")
    public List<Employee> getAll() {
        return iEmployeeServices.getAll();
    }

    @Operation(summary = "Mettre à jour un employé", description = "Permet de mettre à jour les données d'un employé existant")
    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return iEmployeeServices.update(employee);
    }

    @Operation(summary = "Supprimer un employé par ID", description = "Permet de supprimer un employé via son identifiant")
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iEmployeeServices.deleteById(id);
    }
}
