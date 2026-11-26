package tn.esprit.AchwekOurari.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AchwekOurari.Repository.IAgenceRepository;
import tn.esprit.AchwekOurari.Repository.IEquipementRepository;
import tn.esprit.AchwekOurari.Repository.IVehiculeRepository;
import tn.esprit.AchwekOurari.Services.IVehiculeServices;
import tn.esprit.AchwekOurari.entity.Agence;
import tn.esprit.AchwekOurari.entity.CategorieVehicule;
import tn.esprit.AchwekOurari.entity.Equipement;
import tn.esprit.AchwekOurari.entity.Vehicule;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeServices {

    private final IVehiculeRepository iVehiculeRepository;
    private final IAgenceRepository iAgenceRepository;
    private final IEquipementRepository iEquipementRepository;



    @Override
    public Vehicule getById(Long id) {
        return iVehiculeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("vehicule not found"));
    }

    @Override
    public Vehicule add(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteById(Long id) {
        iVehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAll() {
        return iVehiculeRepository.findAll();
    }

    @Override
    public Vehicule assignToAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule =getById(idVehicule);
        Agence agence = iAgenceRepository.findById(idAgence).orElseThrow(() -> new EntityNotFoundException("Agence not found"));
        //affictation
        vehicule.setAgence(agence);

        return iVehiculeRepository.save(vehicule);
    }
    public Vehicule assignToEquipements(Long idVehicule, Long idEquipement){
        Vehicule vehicule = getById(idVehicule);
        Equipement equipement = iEquipementRepository.findById(idEquipement).orElseThrow(() -> new EntityNotFoundException("Agence not found"));
        vehicule.getEquipements().add(equipement);
        return iVehiculeRepository.save(vehicule);

    }

    @Override
    public Vehicule UnassignToAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = getById(idVehicule);
        Agence agence = iAgenceRepository.findById(idAgence).orElseThrow(() -> new EntityNotFoundException("Agence not found"));
        //desaffectation
        vehicule.setAgence(null);
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule UnassignToEquipements(Long idVehicule, Long idEquipemnts) {
        Vehicule vehicule = getById(idVehicule);
        Equipement equipement = iEquipementRepository.findById(idEquipemnts).orElseThrow(() -> new EntityNotFoundException("Agence not found"));
        vehicule.getEquipements().remove(equipement);
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule addVehiculeAndAssignToAgence(Vehicule vehicule, Long idAgence) {
        Agence agence = iAgenceRepository.findById(idAgence).orElseThrow(() -> new EntityNotFoundException("Agence not found"));
        //affectation agence a vehicule
        vehicule.setAgence(agence);
        //save ajouter vehicule + ses equipement a l aide du cascade
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> getAllByCategorie(CategorieVehicule categorie) {
        return iVehiculeRepository.findByCategorie(categorie);
    }

    @Override
    public List<Vehicule> getAllBycategorie(CategorieVehicule categorie) {
        return List.of();
    }
}
