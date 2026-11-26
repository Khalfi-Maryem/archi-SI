package tn.esprit.AchwekOurari.WebController.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.AchwekOurari.entity.Maintenance;

@Mapper(componentModel = "spring")
public interface MaintenanceMapper {

    @Mapping(target ="idMaintenance",source = "idMaintenance")
    @Mapping(target ="idVehicule",source ="vehicule.idVehicule")
    MaintenanceDTO toDto(Maintenance maintenance );

}
