package tn.esprit.maryemkhalfiet4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.maryemkhalfiet4.Repository.IVehiculeRepository;
import tn.esprit.maryemkhalfiet4.Services.IVehiculeService;
import tn.esprit.maryemkhalfiet4.entity.Vehicule;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final IVehiculeRepository iVehiculeRepo;
    @Override
    public Vehicule getById(Long id) {
        return iVehiculeRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("vehicule was not found") );
    }

    @Override
    public Vehicule add(Vehicule vehicule) {
        return iVehiculeRepo.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return iVehiculeRepo.save(vehicule);
    }

    @Override
    public void deleteById(Long id) {
        iVehiculeRepo.deleteById(id);

    }
}
