package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IClientServices;
import tn.esprit.maryemkhalfiet4.entity.Client;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientRestController {

    private final IClientServices iClientServices;

    @PostMapping("/add")
    public Client create(@RequestBody Client client) {
        return iClientServices.add(client);
    }

    @GetMapping("/get/{id}")
    public Client getById(@PathVariable Long id) {
        return iClientServices.getById(id);
    }

    @GetMapping("/all")
    public List<Client> getAll() {
        return iClientServices.getAll();
    }

    @PutMapping("/update")
    public Client update(@RequestBody Client client) {
        return iClientServices.update(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iClientServices.deleteById(id);
    }
}