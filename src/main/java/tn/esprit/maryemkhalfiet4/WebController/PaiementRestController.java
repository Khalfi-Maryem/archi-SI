package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IPaiementServices;
import tn.esprit.maryemkhalfiet4.entity.Paiement;

import java.util.List;

@RestController
@RequestMapping("/paiements")
@RequiredArgsConstructor
public class PaiementRestController {

    private final IPaiementServices iPaiementServices;

    @PostMapping("/add")
    public Paiement create(@RequestBody Paiement paiement) {
        return iPaiementServices.add(paiement);
    }

    @GetMapping("/get/{id}")
    public Paiement getById(@PathVariable Long id) {
        return iPaiementServices.getById(id);
    }

    @GetMapping("/all")
    public List<Paiement> getAll() {
        return iPaiementServices.getAll();
    }

    @PutMapping("/update")
    public Paiement update(@RequestBody Paiement paiement) {
        return iPaiementServices.update(paiement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iPaiementServices.deleteById(id);
    }
}
