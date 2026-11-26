package tn.esprit.AchwekOurari.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("vehicule-reservations")
    @JoinColumn(name = "id_vehicule")
    @ToString.Exclude
    private Vehicule vehicule ;

    @JsonBackReference("client-reservations")
    @ManyToOne
    private Client client;

    @JsonManagedReference("contrat-reservation")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contrat", referencedColumnName = "idContrat")
    private Contrat contrat;

}
