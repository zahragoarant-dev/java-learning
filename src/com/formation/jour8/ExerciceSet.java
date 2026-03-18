package com.formation.jour8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExerciceSet {
	public static void main(String[] args) {
		
		List<String> prenoms = new ArrayList<>();
		prenoms.add("Zahra");
		prenoms.add("Robert");
		prenoms.add("Salma");
		prenoms.add("Zahra");
		prenoms.add("Jean");
		prenoms.add("Robert");
		prenoms.add("Zahra");
		
		// Étape 1 — HashSet :
		Set<String> listePrenoms1 = new HashSet<>();
		
		listePrenoms1.addAll(prenoms);
		
		for(String prenom : listePrenoms1) {
			System.out.println(prenom);
		}
		
		System.out.println("=========================");
		// Étape 2 — LinkedHashSet :
		Set<String> listePrenoms2 = new LinkedHashSet<>(prenoms);
		for(String prenom : listePrenoms2) {
			System.out.println(prenom);
		}
		
		System.out.println("=========================");
		// Étape 3 — TreeSet :
		Set<String> listePrenoms3 = new TreeSet<>(prenoms);
		for(String prenom : listePrenoms3) {
			System.out.println(prenom);
		}
	}

}
