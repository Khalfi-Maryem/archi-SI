package tn.esprit.AchwekOurari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AchwekOurari.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
