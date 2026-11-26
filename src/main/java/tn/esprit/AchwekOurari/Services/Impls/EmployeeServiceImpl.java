package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IEmployeeRepository;
import tn.esprit.AchwekOurari.Services.IEmployeeServices;
import tn.esprit.AchwekOurari.entity.Employee;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeServices {

    private final IEmployeeRepository iEmployeeRepository;

    @Override
    public Employee getById(Long id) {
        return iEmployeeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("employee not found"));
    }

    @Override
    public Employee add(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    @Override
    public void deleteById(Long id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return iEmployeeRepository.findAll();
    }
}
