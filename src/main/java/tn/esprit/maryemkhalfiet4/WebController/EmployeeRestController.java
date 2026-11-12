package tn.esprit.maryemkhalfiet4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.maryemkhalfiet4.Services.IEmployeeServices;
import tn.esprit.maryemkhalfiet4.entity.Employee;

import java.util.List;

@RestController
@RequestMapping({"/employees", "/employes"})
@RequiredArgsConstructor
public class EmployeeRestController {

    private final IEmployeeServices iEmployeeServices;

    @PostMapping("/add")
    public Employee create(@RequestBody Employee employee) {
        return iEmployeeServices.add(employee);
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable Long id) {
        return iEmployeeServices.getById(id);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return iEmployeeServices.getAll();
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return iEmployeeServices.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        iEmployeeServices.deleteById(id);
    }
}