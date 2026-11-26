package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IPaiementRepository;
import tn.esprit.AchwekOurari.Services.IPaiementServices;
import tn.esprit.AchwekOurari.entity.Paiement;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementServices {

    private final IPaiementRepository iPaiementRepository;

    @Override
    public Paiement getById(Long id) {
        return iPaiementRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("paiement not found"));
    }

    @Override
    public Paiement add(Paiement paiement) {
        return iPaiementRepository.save(paiement);
    }

    @Override
    public Paiement update(Paiement paiement) {
        return iPaiementRepository.save(paiement);
    }

    @Override
    public void deleteById(Long id) {
        iPaiementRepository.deleteById(id);
    }

    @Override
    public List<Paiement> getAll() {
        return iPaiementRepository.findAll();
    }
}
