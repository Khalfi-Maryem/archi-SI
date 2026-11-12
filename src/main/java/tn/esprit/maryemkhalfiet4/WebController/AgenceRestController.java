package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IAgenceServices;
import tn.esprit.maryemkhalfiet4.entity.Agence;

import java.util.List;

@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceRestController {

    private final IAgenceServices iAgenceServices;

    @PostMapping("/add")
    public Agence create(@RequestBody Agence agence) {
        return iAgenceServices.add(agence);
    }

    @GetMapping("/get/{id}")
    public Agence getById(@PathVariable Long id) {
        return iAgenceServices.getById(id);
    }

    @GetMapping("/all")
    public List<Agence> getAll() {
        return iAgenceServices.getAll();
    }

    @PutMapping("/update")
    public Agence update(@RequestBody Agence agence) {
        return iAgenceServices.update(agence);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iAgenceServices.deleteById(id);
    }
}
