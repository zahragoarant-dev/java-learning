package com.formation.jour11;

import com.formation.jour7.model.Etudiant;

public class TestExceptionsMetier {
	
	public static void validerNote(double note) {
		if(note<0 || note>20) {
			throw new NoteInvalideException("Note " + note + " invalide !");
		}
		
		System.out.println("Note " + note + " valide.");
	}
	
	public static void chercherEtudiant(int id) {
		Etudiant etudiant = new Etudiant(1,"Goarant", "Zahra", "zahra.goarant@gmail.com", 14, "Java");
		if(etudiant.getId() != id) {
			throw new EtudiantIntrouveException("Etudiant avec l'ID " + id + " est introuvable !");
		}
		
		System.out.println(etudiant);
	}

	public static void main(String[] args) {
		
		// Test 1 — NoteInvalideException :
		try {
			validerNote(14);
			validerNote(25);
		} catch (NoteInvalideException e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		
		// Test 2 — EtudiantIntrouveException :
		try {
			chercherEtudiant(1);
			chercherEtudiant(99);
		} catch (EtudiantIntrouveException e) {
			System.out.println("Erreur " + e.getMessage());
		}
	}
	
}
