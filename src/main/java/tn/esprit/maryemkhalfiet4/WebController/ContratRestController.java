package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IContratServices;
import tn.esprit.maryemkhalfiet4.entity.Contrat;

import java.util.List;

@RestController
@RequestMapping("/contrats")
@RequiredArgsConstructor
public class ContratRestController {

    private final IContratServices iContratServices;

    @PostMapping("/add")
    public Contrat create(@RequestBody Contrat contrat) {
        return iContratServices.add(contrat);
    }

    @GetMapping("/get/{id}")
    public Contrat getById(@PathVariable Long id) {
        return iContratServices.getById(id);
    }

    @GetMapping("/all")
    public List<Contrat> getAll() {
        return iContratServices.getAll();
    }

    @PutMapping("/update")
    public Contrat update(@RequestBody Contrat contrat) {
        return iContratServices.update(contrat);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iContratServices.deleteById(id);
    }
}