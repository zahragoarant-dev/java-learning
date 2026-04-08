package com.formation.jour13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.formation.jour7.model.Etudiant;

public class ExerciceStream {

	public static void main(String[] args) {
		List<Etudiant> etudiants = new ArrayList<>();

		etudiants.add(new Etudiant(1, "Hamdane", "Zahra", "z@gmail.com", 14, "Java"));
		etudiants.add(new Etudiant(2, "Goarant", "Robert", "r@gmail.com", 17, "Python"));
		etudiants.add(new Etudiant(3, "Alaoui", "Salma", "z@gmail.com", 8, "Java"));
		etudiants.add(new Etudiant(4, "Ben", "Jean", "z@gmail.com", 12, "Spring"));
		etudiants.add(new Etudiant(5, "Alami", "Rajaa", "z@gmail.com", 9, "Python"));
		
		System.out.println("Exercice 1 : Opérations de base");

		// filter() — afficher uniquement les admis (note >= 10)
		System.out.println("########## Afficher uniquement les admis (note >= 10) ##########");
		List<Etudiant> filtrer = etudiants.stream()
				.filter(Etudiant::estAdmis)
				.collect(Collectors.toList());

		filtrer.forEach(System.out::println);

		// map() — afficher uniquement les noms
		System.out.println("########## Afficher uniquement les noms ##########");
		etudiants.stream()
			.map(e -> e.getNom())
			.forEach(System.out::println);

		// sorted() — afficher triés par note décroissante
		System.out.println("########## Afficher triés par note décroissante ##########");
		etudiants.stream()
			.sorted((e1, e2) -> Double.compare(e2.getNote(), e1.getNote()))
			.forEach(System.out::println);

		// count() — afficher le nombre d'admis
		System.out.println("########## Afficher le nombre d'admis ##########");
		long nombreAdmis = etudiants.stream()
				.filter(Etudiant::estAdmis)
				.count();
		
		System.out.println("Le nombre d'admis : " + nombreAdmis);

		// forEach() — afficher tous les étudiants
		System.out.println("########## Afficher tous les étudiants ##########");
		etudiants.stream()
			.forEach(System.out::println);
		
		System.out.println("Exercice 2 — Opérations avancées");
		
		/*
		 * 1. limit(2) — afficher uniquement les 2 premiers étudiants
		 * 2. skip(2) — sauter les 2 premiers et afficher le reste
		 * 3. distinct() — à partir d'une liste de filieres avec doublons, afficher les filieres uniques
		 * 4. anyMatch() — est-ce qu'il y a au moins un étudiant en Java ?
		 * 5. allMatch() — est-ce que tous les étudiants sont admis ?
		 * 6. findFirst() — trouver le premier étudiant admis
		 * 7. max() — trouver l'étudiant avec la meilleure note
		 */
		
		System.out.println("########## Afficher uniquement les 2 premiers étudiants ##########");
		etudiants.stream()
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("########## Sauter les 2 premiers et afficher le reste ##########");
		etudiants.stream()
			.skip(2)
			.forEach(System.out::println);
		
		System.out.println("########## À partir d'une liste de filieres avec doublons, afficher les filieres uniques ##########");
		etudiants.stream()
			.map(e -> e.getFiliere())
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("########## Est-ce qu'il y a au moins un étudiant en Java ? ##########");
		boolean etudiantEnJava = etudiants.stream()
			.anyMatch(e -> "Java".equals(e.getFiliere()));

		System.out.println(etudiantEnJava ? "Oui, il y a au moins un étudiant en Java." : "Non, pas d'etudiant en Java.");
		
		System.out.println("########## Est-ce que tous les étudiants sont admis ? ##########");
		boolean tousEtudiantsAdmis = etudiants.stream()
				.allMatch(Etudiant::estAdmis);
		
		System.out.println(tousEtudiantsAdmis ? "Oui, tous les étudiants sont admis." : "Non, pas tous les étudiants sont admis.");

		System.out.println("########## Trouver le premier étudiant admis ##########");
		Optional<Etudiant> premierEtudiantAdmis = etudiants.stream()
			.filter(Etudiant::estAdmis)
			.findFirst();
		
		premierEtudiantAdmis.ifPresent(e -> System.out.println("Le premier étudiant admis : " + e)) ;	
		
		System.out.println("########## Trouver l'étudiant avec la meilleure note ##########");
		Optional<Etudiant> etudiantMeilleurNote = etudiants.stream()
			.max((e1,e2) -> Double.compare(e1.getNote(), e2.getNote()));
		

		etudiantMeilleurNote.ifPresent(e-> System.out.println("L'étudiant avec la meilleure note : " + e)); 
		
		System.out.println("Exercice 3 — Pipeline complet");
		/*
		 * Crée un pipeline Stream qui fait tout en une seule chaîne :
		 * Prendre les étudiants admis
		 * Les trier par note décroissante
		 * Extraire uniquement leurs noms
		 * Afficher chaque nom avec son rang (1er, 2ème, 3ème...)
		 */
		
		System.out.println("########## Crée un pipeline Stream qui fait tout en une seule chaîne : ##########");
		int[] rang = {1};
		etudiants.stream()
			.filter(Etudiant::estAdmis)
			.sorted((e1,e2) -> Double.compare(e2.getNote(), e1.getNote()))
			.map(Etudiant::getNom)
			.forEach(nom -> System.out.println(rang[0] ++ + "- " + nom));
	}
}
