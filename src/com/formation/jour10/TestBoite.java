package com.formation.jour10;

import com.formation.jour7.model.Etudiant;

public class TestBoite {

	public static void main(String[] args) {
		// Test 1 — Boite de String :
		Boite<String> boiteString = new Boite<>();
		
		// Vérifier si vide avant de mettre quelque chose
		if(boiteString.estVide()) {
			System.out.println("La boite est vide.");
		} else {
			System.out.println("La boite n'est pas vide.");
		}
		
		// Mettre "Zahra" dedans
		boiteString.mettre("Zahra");
		
		// Ouvrir et afficher le contenu
		System.out.println(boiteString.ouvrir());
		System.out.println(boiteString);
		
		// Vérifier si vide après
		if(boiteString.estVide()) {
			System.out.println("La boite est vide.");
		} else {
			System.out.println("La boite n'est pas vide.");
		}
		
		// Test 2 — Boite d'Integer :
		Boite<Integer> boiteInteger = new Boite<>();
		
		// Mettre 40 dedans
		boiteInteger.mettre(40);
		
		// Ouvrir et afficher
		System.out.println(boiteInteger.ouvrir());
		System.out.println(boiteInteger);
		
		// Test 3 — Boite d'Etudiant :
		Boite<Etudiant> boiteEtudiant = new Boite<>();
				
		// Mettre un étudiant dedans
		boiteEtudiant.mettre(new Etudiant(1, "Hamdane", "Zahra", "zahra.hamdane@gmail.com", 17, "Java"));
		
		// Ouvrir et afficher
		System.out.println(boiteEtudiant.ouvrir());
		System.out.println(boiteEtudiant);



		
		
	}

}
