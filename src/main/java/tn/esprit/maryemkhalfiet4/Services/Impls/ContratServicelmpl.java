package tn.esprit.maryemkhalfiet4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.maryemkhalfiet4.Repository.IContratRepository;
import tn.esprit.maryemkhalfiet4.Services.IContratServices;
import tn.esprit.maryemkhalfiet4.entity.Contrat;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratServices {

    private final IContratRepository iContratRepository;

    @Override
    public Contrat getById(Long id) {
        return iContratRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("contrat not found"));
    }

    @Override
    public Contrat add(Contrat contrat) {
        return iContratRepository.save(contrat);
    }

    @Override
    public Contrat update(Contrat contrat) {
        return iContratRepository.save(contrat);
    }

    @Override
    public void deleteById(Long id) {
        iContratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> getAll() {
        return iContratRepository.findAll();
    }
}