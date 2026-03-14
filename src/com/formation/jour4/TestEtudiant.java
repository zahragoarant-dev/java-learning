package com.formation.jour4;

public class TestEtudiant {

	public static void main(String[] args) {
		// Test 1 — Constructeur complet : Crée un étudiant avec toutes ses infos et
		// appelle afficherProfil()
		Etudiant etudiant1 = new Etudiant(1, "HAMDANE", "Zahra", "zahra.hamdane@gmail.com", 10);
		etudiant1.afficherProfil();

		// Test 2 — Constructeur vide + Setters : Crée un étudiant vide, puis utilise
		// les setters pour remplir ses infos et appelle afficherProfil()
		Etudiant etudiant2 = new Etudiant();
		etudiant2.setId(2);
		etudiant2.setNom("GOARANT");
		etudiant2.setPrenom("Robert");
		etudiant2.setEmail("robert.goarant@gmail.com");
		etudiant2.setNote(20);
		etudiant2.afficherProfil();

		// Test 3 — Validation : Essaie de mettre une note invalide (-5 ou 25) et un
		// email invalide (zahraformation.com)
		etudiant1.setNote(-5);
		etudiant2.setNote(25);
		etudiant1.setEmail("zahraformation.com");

		// Test 4 — Stack & Heap
		Etudiant e1 = new Etudiant(1, "Goarant", "Zahra", "zahra@formation.com", 14.0);
		Etudiant e2 = e1;
		e2.setNom("Dupont");
		System.out.println(e1.getNom());
		
		System.out.println(etudiant1);
		
	}

}
