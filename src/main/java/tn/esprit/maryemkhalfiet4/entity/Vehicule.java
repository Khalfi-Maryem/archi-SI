package tn.esprit.maryemkhalfiet4.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
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
    private long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(value = EnumType.STRING)
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    @Enumerated(value = EnumType.STRING)
    private StatutVehicule statut;

    @ManyToMany
    List<Equipement> equipements;

    @ManyToOne
    Agence agence;

    @OneToMany(mappedBy = "vehicule")
    private List<Maintenance> maintenances;

    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;

}
