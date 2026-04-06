package com.formation.jour12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.formation.jour7.model.Etudiant;

public class ExerciceCollectionsLambda {

	public static void main(String[] args) {
		List<Etudiant> etudiants = new ArrayList<>();
		
		etudiants.add(new Etudiant(1, "Hamdane", "Zahra", "z@gmail.com", 14, "Java"));
		etudiants.add(new Etudiant(2, "Goarant", "Robert", "r@gmail.com", 17, "Python"));
		etudiants.add(new Etudiant(3, "Alaoui", "Salma", "z@gmail.com", 8, "Java"));
		etudiants.add(new Etudiant(4, "Ben", "Jean", "z@gmail.com", 12, "Spring"));
		etudiants.add(new Etudiant(5, "Alami", "Rajaa", "z@gmail.com", 9, "Python"));
		
		// Trier par note décroissante avec Comparator.comparing()
		System.out.println("Trier par note décroissante avec Comparator.comparing() :");
		etudiants.sort((e1, e2) -> 
			Double.compare(e2.getNote(), e1.getNote())
		);
		
		for(Etudiant e : etudiants) {
			System.out.println(e);
		}

		// Filtrer manuellement les admis (note >= 10) 
		
		System.out.println("Filtrer manuellement les admis (note >= 10) :");
		Predicate<Etudiant> filtrer = Etudiant::estAdmis;
		
		for(Etudiant e : etudiants) {
			if(filtrer.test(e)) System.out.println(e);
		}
		
		// Transformer — extraire les noms avec Function
		System.out.println("Transformer — extraire les noms avec Function :");
		Function<Etudiant, String> transformer = Etudiant::getNom;
		
		for(Etudiant e : etudiants) {
			System.out.println(transformer.apply(e));
		}


	}

}
