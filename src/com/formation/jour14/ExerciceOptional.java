package com.formation.jour14;

import java.util.Optional;

public class ExerciceOptional {

	public static void main(String[] args) {
		// Test 1 — Créer des Optional :
		Optional<String> opt1 = Optional.of("Zahra");
		Optional<String> opt2 = Optional.empty();
		Optional<String> opt3 = Optional.ofNullable(null);
		
		// Test 2 — orElse() :
		System.out.println("########## Sur un Optional plein → retourne la valeur ##########");
		System.out.println(opt1.get());	
		
		System.out.println("########## Sur un Optional vide → retourne la valeur par défaut ##########");
		System.out.println(opt2.orElse("Robert"));
		
		// Test 3 — ifPresent() :
		System.out.println("########## Afficher la valeur seulement si présente ##########");
		opt3.ifPresent(System.out::println);

		// Test 4 — map() sur Optional :
		System.out.println("########## Transformer la valeur si présente ##########");
		System.out.println(opt1.map(String::toUpperCase).orElse("vide"));
		
		// Test 5 — orElseThrow() :
		System.out.println("########## Lancer une exception si vide ##########");
		opt2.orElseThrow();		

	}

}
