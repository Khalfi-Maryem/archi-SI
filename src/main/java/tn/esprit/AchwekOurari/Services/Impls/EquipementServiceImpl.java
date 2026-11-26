package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IEquipementRepository;
import tn.esprit.AchwekOurari.Services.IEquipementServices;
import tn.esprit.AchwekOurari.entity.Equipement;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementServices {

    private final IEquipementRepository iEquipementRepository;

    @Override
    public Equipement getById(Long id) {
        return iEquipementRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("equipement not found"));
    }

    @Override
    public Equipement add(Equipement equipement) {
        return iEquipementRepository.save(equipement);
    }

    @Override
    public Equipement update(Equipement equipement) {
        return iEquipementRepository.save(equipement);
    }

    @Override
    public void deleteById(Long id) {
        iEquipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAll() {
        return iEquipementRepository.findAll();
    }
}
