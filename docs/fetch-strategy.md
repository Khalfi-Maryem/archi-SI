# Stratégie de fetch et de cascade — Atelier 2

| Association | Fetch | Cascade | Justification |
|---|---|---|---|
| Contrat → Paiement | LAZY | ALL + `orphanRemoval = true` | Un paiement dépend du contrat. La suppression du contrat supprime ses paiements et retirer un paiement de la collection le supprime en base. |
| Agence → Véhicule | LAZY | Aucune | Un véhicule peut survivre à la suppression de son agence. |
| Agence → Employee | LAZY | Aucune | L'employé est géré indépendamment et ne doit pas être supprimé automatiquement avec l'agence. |
| Véhicule ↔ Equipement | LAZY | Aucune | Les équipements peuvent être partagés entre plusieurs véhicules ; `Set` évite les doublons. |
| Client → Reservation | LAZY | PERSIST | Enregistrer un client peut enregistrer ses nouvelles réservations, sans propager automatiquement les suppressions. |
| Reservation → Véhicule | LAZY | Aucune | Le véhicule existe indépendamment d'une réservation. |
| Reservation ↔ Contrat | LAZY | ALL côté Reservation | Le mapping est bidirectionnel : `Contrat` porte la clé étrangère `reservation_id_reservation`, tandis que `Reservation` utilise `mappedBy = "reservation"`. La cascade est configurée du côté Reservation conformément au tableau de l'atelier. |
| Véhicule → Maintenance | LAZY | PERSIST | Enregistrer un véhicule peut enregistrer ses nouvelles maintenances, sans supprimer automatiquement l'historique avec le véhicule. |

## Notes de mapping

- Le côté propriétaire est celui qui porte la clé étrangère : `@ManyToOne` pour les relations plusieurs-vers-un, et `Contrat` pour le `@OneToOne` Reservation–Contrat.
- `mappedBy` doit correspondre exactement au nom du champ du côté propriétaire.
- `LAZY` évite de charger systématiquement les associations. Il faut accéder aux relations dans une transaction ou prévoir une requête dédiée.
- Les noms des colonnes générées par Hibernate peuvent dépendre de la stratégie de nommage. La table de jointure de l'association Véhicule–Equipement est explicitement nommée `vehicule_equipement`.
- Les entités utilisent `@Getter` / `@Setter` ciblés et excluent les associations de `toString` afin d'éviter les récursions entre entités.

## Synchroniser les deux côtés

Pour les relations bidirectionnelles, mettre à jour les deux côtés en mémoire (par exemple `Contrat.addPaiement` et `Contrat.removePaiement`). Le côté propriétaire reste celui qui détermine la clé étrangère en base.
