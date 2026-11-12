package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IMaintenanceServices;
import tn.esprit.maryemkhalfiet4.entity.Maintenance;

import java.util.List;

@RestController
@RequestMapping("/maintenances")
@RequiredArgsConstructor
public class MaintenanceRestController {

    private final IMaintenanceServices iMaintenanceServices;

    @PostMapping("/add")
    public Maintenance create(@RequestBody Maintenance maintenance) {
        return iMaintenanceServices.add(maintenance);
    }

    @GetMapping("/get/{id}")
    public Maintenance getById(@PathVariable Long id) {
        return iMaintenanceServices.getById(id);
    }

    @GetMapping("/all")
    public List<Maintenance> getAll() {
        return iMaintenanceServices.getAll();
    }

    @PutMapping("/update")
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return iMaintenanceServices.update(maintenance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iMaintenanceServices.deleteById(id);
    }
}
