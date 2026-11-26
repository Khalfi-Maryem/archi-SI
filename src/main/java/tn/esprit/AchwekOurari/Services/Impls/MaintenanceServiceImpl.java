package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IMaintenanceRepository;
import tn.esprit.AchwekOurari.Services.IMaintenanceServices;
import tn.esprit.AchwekOurari.WebController.dto.MaintenanceDTO;
import tn.esprit.AchwekOurari.WebController.dto.MaintenanceMapper;
import tn.esprit.AchwekOurari.entity.Maintenance;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceServices {

    private final IMaintenanceRepository iMaintenanceRepository;
    private final MaintenanceMapper maintenanceMapper;
    @Override
    public MaintenanceDTO getById(Long id) {

        Maintenance maintenance = iMaintenanceRepository.findById(id).orElseThrow(() -> new RuntimeException("ex"));
        return maintenanceMapper.toDto(maintenance);
    }

    @Override
    public Maintenance add(Maintenance maintenance) {
        return iMaintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return iMaintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteById(Long id) {
        iMaintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> getAll() {
        return iMaintenanceRepository.findAll();
    }
}
