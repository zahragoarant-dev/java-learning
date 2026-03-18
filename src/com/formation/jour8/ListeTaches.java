package com.formation.jour8;

import java.util.ArrayList;
import java.util.List;

public class ListeTaches {

	static List<String> listes = new ArrayList<>();
	
	static boolean tacheEstexiste(String tache) {
		if(listes.contains(tache)) {
			System.out.println("La tâche " + tache + " existe.");
			return true;
		} else {
			System.out.println("La tache " + tache + " n'existe pas.");
		}
		return false;
	}

	public static void main(String[] args) {

		// Ajouter 5 tâches de ton choix
		listes.add("tache 1");
		listes.add("tache 2");
		listes.add("tache 3");
		listes.add("tache 4");
		listes.add("tache 5");

		// Afficher toutes les tâches avec leur numéro
		for (int i = 0; i < listes.size(); i++) {
			System.out.println("Tache n° " + (i+1) + " : " + listes.get(i));
		}
		
		// Supprimer la 2ème tâche par index
		listes.remove(1);
		System.out.println("La 2ème tache est suprimée.");
		
		// Vérifier si une tâche existe avec contains()
		tacheEstexiste("tache 1");
		
		// Afficher le nombre de tâches avec size()
		System.out.println("Le nombre de tâches est : " + listes.size());
		
		// Vider la liste avec clear() et vérifier avec isEmpty()
		listes.clear();
		if(listes.isEmpty()) {
			System.out.println("La liste est vide.");
		} else {
			System.out.println("La liste n'est pas vide.");
		}
		
	}

}
