package com.formation.jour10;

import java.util.ArrayList;
import java.util.List;

public class TestUtils {

	public static void main(String[] args) {
		// Test 1 — afficherTous() :
		// Créer une List<String> avec 4 prénoms
		List<String> prenoms = new ArrayList<>();
		
		prenoms.add("Zahra");
		prenoms.add("Robert");
		prenoms.add("Ali");
		
		// Appeler UtilsGenerics.afficherTous(liste)
		UtilsGenerics.afficherTous(prenoms);
		
		// Test 2 — swap() :
		// Créer une List<String> avec "Java", "Python", "Spring"
		List<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("Spring");
		
		// Afficher avant le swap
		UtilsGenerics.afficherTous(languages);
		
		// Échanger index 0 et index 2
		UtilsGenerics.swap(languages, 0, 2);
		
		// Afficher après le swap
		UtilsGenerics.afficherTous(languages);


		

	}

}
