package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.entity.Employee;

import java.util.List;

public interface IEmployeeServices {
    Employee getById(Long id);
    Employee add(Employee employee);
    Employee update(Employee employee);
    void deleteById(Long id);
    List<Employee> getAll();
}
