package com.formation.jour6;

import java.util.ArrayList;
import java.util.List;

public class TestFormes {

	public static void main(String[] args) {
		// Test 1 — Créer les formes et appeler afficher() :
		System.out.println("Test 1 — Créer les formes et appeler afficher() :");
		Cercle c = new Cercle("rouge", 5);
		Rectangle r = new Rectangle("bleu", 4, 3);
		Triangle t = new Triangle("Vert", 6, 4, 5);

		c.afficher();
		r.afficher();
		t.afficher();

		// Test 2 — Polymorphisme avec List<Forme> :
		// Test 3 — Interface Dessinable :
		System.out.println("Test 2 — Polymorphisme avec List<Forme> :");
		System.out.println("Test 3  Interface Dessinable :");

		List<Forme> formes = new ArrayList<>();
		formes.add(c);
		formes.add(r);
		formes.add(t);

		for (Forme forme : formes) {
			forme.afficher();
			
			// Pattern Matching Java 17 
			if(forme instanceof Dessinable d) {
				d.dessiner();
				d.effacer();
			}
		}
		
		// Test 4 — Tenter d'instancier Forme directement 
		System.out.println("Test 4 — Tenter d'instancier Forme directement :");
		// Forme f = new Forme("Rouge"); 
		// que se passe-t-il ?
		// On ne peut pas instancier une classe abstraite — elle est faite pour être héritée
	}

}
