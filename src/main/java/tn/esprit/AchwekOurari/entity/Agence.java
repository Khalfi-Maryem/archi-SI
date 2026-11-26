package tn.esprit.AchwekOurari.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @JsonManagedReference("agence-vehicules")
    @OneToMany(mappedBy = "agence")
    List<Vehicule> vehicules;

    @JsonManagedReference("agence-employes")
    @OneToMany(mappedBy = "agence")
    private List<Employee> employes;
}
