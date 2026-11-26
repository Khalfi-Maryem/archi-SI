# Note de synthèse — Couche Repository (Atelier 3)

## 1. Choix et justification des interfaces Repository

Toutes les interfaces étendent `JpaRepository<Entité, Long>` afin de bénéficier :
- De l'ensemble des opérations CRUD de base (`save`, `findById`, `deleteById`).
- De méthodes retournant des `List` directement (via `ListCrudRepository`) plutôt que de simples `Iterable`, facilitant la manipulation en Java (streams, accès par index).
- Des fonctionnalités de tri et pagination (`PagingAndSortingRepository`).
- Des méthodes propres à JPA telles que `flush()`, `saveAndFlush()` et `deleteAllInBatch()`.

| Interface | Étend | Justification |
|---|---|---|
| `IContratRepository` | `JpaRepository<Contrat, Long>` | CRUD complet, manipulation des contrats sous forme de `List`, support de `saveAndFlush` et de la pagination. |
| `IAgenceRepository` | `JpaRepository<Agence, Long>` | CRUD complet, listing direct sous forme de `List`, pagination et tri sur les agences. |
| `IClientRepository` | `JpaRepository<Client, Long>` | CRUD complet, recherche par identifiant et gestion de la liste des clients. |
| `IEmployeeRepository` | `JpaRepository<Employee, Long>` | CRUD complet sur les employés, manipulation des collections en `List`. |
| `IEquipementRepository` | `JpaRepository<Equipement, Long>` | CRUD complet pour les équipements de véhicules. |
| `IMaintenanceRepository` | `JpaRepository<Maintenance, Long>` | CRUD complet pour l'historique et les interventions de maintenance. |
| `IPaiementRepository` | `JpaRepository<Paiement, Long>` | Permet la lecture directe et la gestion des paiements liés aux contrats. |
| `IReservationRepository` | `JpaRepository<Reservation, Long>` | CRUD complet sur les réservations avec gestion simplifiée des listes et pagination. |
| `IVehiculeRepository` | `JpaRepository<Vehicule, Long>` | CRUD complet sur le parc automobile, tri et pagination disponibles. |

---

## 2. Anomalies SonarQube for IDE (SonarLint) et corrections

| Anomalie SonarQube for IDE | Règle / explication | Correction apportée |
|---|---|---|
| Imports inutilisés (`java:S1128`) | Des imports superflus alourdissent le code et peuvent masquer les dépendances réelles (ex: `CrudRepository` inutilisé dans `IVehiculeRepository`). | Suppression de tous les imports inutilisés dans les classes de repository et service. |
| Injection par champ déconseillée (`java:S6813`) | L'utilisation de `@Autowired` sur les attributs empêche l'immutabilité et complique les tests unitaires. | Utilisation de l'injection par constructeur avec Lombok `@RequiredArgsConstructor` et des champs marqués `private final`. |
| Éviter l'annotation `@Data` sur les entités JPA (`java:S6856`) | `@Data` génère automatiquement `equals`, `hashCode` et `toString` qui peuvent déclencher des chargements paresseux involontaires ou des boucles infinies (`StackOverflowError`). | Utilisation ciblée de `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`, `@Builder` et `@ToString` sans `@Data`. |

---

## 3. Remarques sur l'exécution

- Au démarrage, Spring Data JPA détecte les 9 interfaces et affiche dans les logs : `Found 9 JPA repository interfaces`.
- Les couches Service et Controller ont également été généralisées pour chacune des 9 entités afin de permettre le test complet des opérations CRUD via des requêtes REST (Postman).
