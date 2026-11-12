package tn.esprit.maryemkhalfiet4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.maryemkhalfiet4.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
