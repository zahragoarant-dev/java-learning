package com.formation.jour14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.formation.jour7.model.Etudiant;

public class PipelineComplet {

	public static void main(String[] args) {
		List<Etudiant> etudiants = new ArrayList<>();

		etudiants.add(new Etudiant(1, "Hamdane", "Zahra", "z@gmail.com", 14, "Java"));
		etudiants.add(new Etudiant(2, "Goarant", "Robert", "r@gmail.com", 17, "Python"));
		etudiants.add(new Etudiant(3, "Alaoui", "Salma", "z@gmail.com", 8, "Java"));
		etudiants.add(new Etudiant(4, "Ben", "Jean", "z@gmail.com", 12, "Spring"));
		etudiants.add(new Etudiant(5, "Alami", "Rajaa", "z@gmail.com", 9, "Python"));
		
		String resultat = etudiants.stream()
		.filter(Etudiant::estAdmis)
		.sorted((Comparator.comparing(Etudiant::getNote).reversed()))
		.map(Etudiant::getNom)
		.collect(Collectors.joining(" | "));
		
		System.out.println(resultat);
		
	}

}
