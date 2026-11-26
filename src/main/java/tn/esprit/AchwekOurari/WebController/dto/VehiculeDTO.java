package tn.esprit.AchwekOurari.WebController.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import tn.esprit.AchwekOurari.entity.CategorieVehicule;

import java.math.BigDecimal;

@Getter
@Setter
public class VehiculeDTO {
    @NotBlank(message = "Le modéle est obligatoire")
    private String immatriculation;
    @NotBlank(message = "Le modéle est obligatoire")
    private String marque;
    @NotBlank(message = "Le modéle est obligatoire")
    private String modele;
    @NotBlank(message = "Le modéle est obligatoire")
    private CategorieVehicule categorie;
    @NotBlank(message = "Le modéle est obligatoire")
    private BigDecimal tarif;
    @NotBlank(message = "Le modéle est obligatoire")
    private String nomAgence;
}
