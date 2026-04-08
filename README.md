# ☕ Java Learning — Formation Java 17

Projet de formation Java 17 progressif vers Spring Boot.

## 🛠️ Environnement
- Java 17
- Eclipse IDE
- GitHub (EGit)

## 📅 Programme
| Jour | Thème | Statut |
|------|-------|--------|
| Jour 1 | Types, variables, conventions Java 17 | ✅ |
| Jour 2 | Structures de contrôle, boucles, FizzBuzz | ✅ |
| Jour 3 | Méthodes, tableaux, Calculatrice CLI | ✅ |
| Jour 4 | POO, Classes, Encapsulation, Stack/Heap | ✅ |
| Jour 5 | Héritage, Polymorphisme, Pattern Matching | ✅ |
| Jour 6 | Classes Abstraites, Interfaces, Default Methods | ✅ |
| Jour 7 | Mini-Projet Gestion Étudiants | ✅ |
| Jour 8 | Collections : List & Set | ✅ |
| Jour 9 | Collections : Map & Queue | ✅ |
| Jour 10 | Generics & Types Paramétrés | ✅ |
| Jour 11 | Exceptions : try-catch, personnalisées, try-with-resources | ✅ |
| Jour 12 | Lambdas & Interfaces Fonctionnelles | ✅ |
| Jour 13 | Stream API : filter, map, sorted, collect, Optional | ✅ |
| Jour 14 | Stream Avancé : Collectors, groupingBy, Optional | 🔜 |

## 🚀 Mini-Projets
| Projet | Jour | Description |
|--------|------|-------------|
| Calculatrice CLI | 3 | Menu interactif, 4 opérations, historique 5 calculs |
| Gestion Étudiants | 7 | Architecture model/service/app, CRUD, statistiques, exceptions métier |
| Formes Géométriques | 6 | Calcul surface/périmètre, classe abstraite, interface |

## 📦 Structure
```
src/
└── com/formation/
    ├── jour1/  → HelloWorld, MonProfil
    ├── jour2/  → StructuresControle, Boucles, FizzBuzz
    ├── jour3/  → IntroMethodes, IntroTableaux, Calculatrice
    ├── jour4/  → Etudiant, TestEtudiant
    ├── jour5/  → Personne, Etudiant, Professeur, TestHeritage
    ├── jour6/  → Forme, Dessinable, Cercle, Rectangle, Triangle
    ├── jour7/  → model/Etudiant,
    │             service/GestionEtudiantService,
    │             app/Application
    ├── jour8/  → ListeTaches, ExerciceSet, PerformanceList
    ├── jour9/  → Annuaire, FrequenceMots, FileImpression
    ├── jour10/ → Boite, Stack, Repository, EtudiantRepository,
    │             UtilsGenerics, TestBoite, TestStack,
    │             TestRepository, TestUtils
    ├── jour11/ → NoteInvalideException,
    │             EtudiantIntrouveException,
    │             ExerciceTryCatch,
    │             TestExceptionsMetier,
    │             ExerciceTryResources
    ├── jour12/ → ExerciceLambda,
    │             ExerciceCollectionsLambda
    └── jour13/ → ExerciceStream
```