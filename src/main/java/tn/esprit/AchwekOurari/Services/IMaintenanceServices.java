package tn.esprit.AchwekOurari.Services;

import tn.esprit.AchwekOurari.WebController.dto.MaintenanceDTO;
import tn.esprit.AchwekOurari.entity.Maintenance;

import java.util.List;

public interface IMaintenanceServices {
    MaintenanceDTO getById(Long id);
    Maintenance add(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    void deleteById(Long id);
    List<Maintenance> getAll();

}
