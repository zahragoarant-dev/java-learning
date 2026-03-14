package com.formation.jour5;

import java.util.ArrayList;
import java.util.List;

public class TestHeritage {

	public static void main(String[] args) {
		// Test 1 — Créer 2 étudiants et 2 professeurs et appeler sePresenter() sur
		// chacun
		Etudiant etudiant1 = new Etudiant("Hamdane", "Zahra", "zahra.hamdane@gmail.com", 40, 1, 14, "Java");
		Etudiant etudiant2 = new Etudiant("Goarant", "Robert", "robert.goarant@gmail.com", 48, 2, 17,
				"Commerce Internationnal");

		Professeur professeur1 = new Professeur("Alami", "Salma", "slma.alami@gmail.com", 50, 1, "Mathématiques", 2500);
		Professeur professeur2 = new Professeur("Dupond", "Jean", "jean.dupond@gmail.com", 56, 1, "Physiques", 3000);

		etudiant1.sePresenter();
		etudiant2.sePresenter();
		professeur1.sePresenter();
		professeur2.sePresenter();

		System.out.println("===================================================================");

		// Test 2 — Polymorphisme : Crée une ArrayList<Personne> et ajoute tes 4 objets
		// dedans.
		// Parcours la liste avec un for-each et appelle sePresenter() sur chaque
		// élément.
		// Test 3 — instanceof : Dans la boucle, teste le type réel de chaque objet :

		List<Personne> personnes = new ArrayList<Personne>();
		personnes.add(etudiant1);
		personnes.add(etudiant2);
		personnes.add(professeur1);
		personnes.add(professeur2);

		for (Personne personne : personnes) {
			personne.sePresenter();

			if (personne instanceof Etudiant e) {
				System.out.println("C'est un étudiant !");
				System.out.println(e.getNote());
			}
			if (personne instanceof Professeur p) {
				System.out.println("C'est un professeur !");
				System.out.println(p.getMatiere());
			}
		}
	}

}
