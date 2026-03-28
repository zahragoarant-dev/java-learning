package com.formation.jour11;

import java.util.Scanner;

public class ExerciceTryResources {
	
	public static void validerNote(double note) {
		if(note<0 || note> 20) {
			throw new NoteInvalideException("Note " + note + " est invalide !");
		}
		
		System.out.println("Note " + note +  " acceptée !.");
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Veuillez saisir une note : ");
			double note = scanner.nextDouble();
			validerNote(note);
		} catch (NoteInvalideException e) {
			System.out.println("Erreur : " + e.getMessage());
		}
	}
}
