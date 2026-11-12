package tn.esprit.maryemkhalfiet4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.maryemkhalfiet4.Repository.IEquipementRepository;
import tn.esprit.maryemkhalfiet4.Services.IEquipementServices;
import tn.esprit.maryemkhalfiet4.entity.Equipement;

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
