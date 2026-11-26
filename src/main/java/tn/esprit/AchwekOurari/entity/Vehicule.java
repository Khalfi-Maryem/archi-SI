package tn.esprit.AchwekOurari.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(value = EnumType.STRING)
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    @Enumerated(value = EnumType.STRING)
    private StatutVehicule statut;



    @ManyToMany(cascade = CascadeType.PERSIST)
    List<Equipement> equipements =  new ArrayList<>();

    @JsonBackReference("agence-vehicules")
    @ManyToOne
    Agence agence;

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JsonManagedReference("vehicule-maintenances")
    @ToString.Exclude
    private List<Maintenance> maintenances ;

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
    @JsonManagedReference("vehicule-reservations")
    @ToString.Exclude
    private List<Reservation> reservations ;

}
