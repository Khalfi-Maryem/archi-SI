package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.maryemkhalfiet4.Services.IVehiculeService;
import tn.esprit.maryemkhalfiet4.entity.Vehicule;

@RestController
@RequestMapping("/Vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {
    private final IVehiculeService iVehiculeService;
    @PostMapping("add")
    Vehicule create(@RequestBody Vehicule vehicule){
        return iVehiculeService.add(vehicule);
    }
}
