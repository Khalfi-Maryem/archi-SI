package tn.esprit.maryemkhalfiet4.Services;

import tn.esprit.maryemkhalfiet4.entity.Employee;

import java.util.List;

public interface IEmployeeServices {
    Employee getById(Long id);
    Employee add(Employee employee);
    Employee update(Employee employee);
    void deleteById(Long id);
    List<Employee> getAll();
}
