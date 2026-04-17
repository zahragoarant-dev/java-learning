package com.formation.jour14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.formation.jour7.model.Etudiant;

public class ExerciceCollectors {

	public static void main(String[] args) {
		List<Etudiant> etudiants = new ArrayList<>();

		etudiants.add(new Etudiant(1, "Hamdane", "Zahra", "z@gmail.com", 14, "Java"));
		etudiants.add(new Etudiant(2, "Goarant", "Robert", "r@gmail.com", 17, "Python"));
		etudiants.add(new Etudiant(3, "Alaoui", "Salma", "z@gmail.com", 8, "Java"));
		etudiants.add(new Etudiant(4, "Ben", "Jean", "z@gmail.com", 12, "Spring"));
		etudiants.add(new Etudiant(5, "Alami", "Rajaa", "z@gmail.com", 9, "Python"));
		
		/*
		 * Crée un Stream qui :
		 * Extrait les noms de tous les étudiants
		 * Les joint avec ", " comme séparateur
		 * Affiche le résultat
		 */
		
		System.out.println("########## Crée un Stream qui : Extrait les noms de tous les étudiants, Les joint avec ',' comme séparateur et Affiche le résultat ##########");
		
		String nomsEtudiants = etudiants.stream()
				.map(Etudiant::getNom)
				.collect(Collectors.joining(", "));
		
		System.out.println(nomsEtudiants);
		
		/* 
		 * toSet() — collecter les filieres dans un Set
		 * averagingDouble() — calculer la moyenne des notes
		 * counting() — compter le nombre d'admis
		 * groupingBy() — grouper les étudiants par filière et afficher chaque groupe
		*/
		
		System.out.println("########## toSet() — collecter les filieres dans un Set ##########");
		
		Set<String> filieres = etudiants.stream()
				.map(Etudiant::getFiliere)
				.collect(Collectors.toSet());
		
		filieres.stream()
		.forEach(System.out::println);
		
		System.out.println("########## averagingDouble() — calculer la moyenne des notes ##########");
		double moyenneNotes = etudiants.stream()
				.collect(Collectors.averagingDouble(Etudiant::getNote));
		
		System.out.println("La moyenne des notes : " + moyenneNotes);
		
		System.out.println("########## counting() — compter le nombre d'admis ##########");
		long nombreAdmis = etudiants.stream()
				.filter(Etudiant::estAdmis)
				.collect(Collectors.counting());
		
		System.out.println("Le nombre d'admis : " + nombreAdmis);
		
		System.out.println("########## groupingBy() — grouper les étudiants par filière et afficher chaque groupe ##########");
		Map<String, List<Etudiant>> etudiantsParFiliere = etudiants.stream()
				.collect(Collectors.groupingBy(Etudiant::getFiliere));
		
		etudiantsParFiliere.forEach((filiere, liste) -> {
		    System.out.println("Filière : " + filiere);
		    liste.forEach(e -> System.out.println("  → " + e.getNom()));
		});


	}
	


}
