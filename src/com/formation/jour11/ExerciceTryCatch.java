package com.formation.jour11;

public class ExerciceTryCatch {

	public static void main(String[] args) {
		// Test 1 — Division par zéro :

		int a = 10, b = 0;
		try {
			int resultat = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		// Sans try-catch → ArithmeticException : CRASH !
		// Avec try-catch → afficher un message propre
		
		// Test 2 — Tableau hors limites :
		int[] notes = {14,16,12};
		// Accéder à notes[5] → ArrayIndexOutOfBoundsException
		try {
			System.out.println(notes[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur : " + e.getMessage());
		}

		// Test 3 — NullPointerException :
		String nom = null;
		// Appeler nom.length() → NullPointerException
		try {
			System.out.println(nom.length());
		} catch(NullPointerException e) {
			System.out.println("Erreur : " + e.getMessage());
		}
				
		// Test 4 — Attraper plusieurs exceptions :
		try {
			int resultat = a/b;
			System.out.println(notes[5]);
		} catch (ArithmeticException e) {
			System.out.println("Erreur : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erreur : " + e.getMessage());
		} finally {
		    System.out.println("Finally toujours exécuté !");
		}
		
		
	}

}
