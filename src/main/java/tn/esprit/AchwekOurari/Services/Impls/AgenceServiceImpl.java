package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IAgenceRepository;
import tn.esprit.AchwekOurari.Services.IAgenceServices;
import tn.esprit.AchwekOurari.entity.Agence;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceServices {

    private final IAgenceRepository iAgenceRepository;

    @Override
    public Agence getById(Long id) {
        return iAgenceRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("agence not found"));
    }

    @Override
    public Agence add(Agence agence) {
        return iAgenceRepository.save(agence);
    }

    @Override
    public Agence update(Agence agence) {
        return iAgenceRepository.save(agence);
    }

    @Override
    public void deleteById(Long id) {
        iAgenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> getAll() {
        return iAgenceRepository.findAll();
    }
}
