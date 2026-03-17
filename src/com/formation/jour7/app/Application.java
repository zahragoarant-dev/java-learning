package com.formation.jour7.app;

import java.util.List;
import java.util.Scanner;

import com.formation.jour7.model.Etudiant;
import com.formation.jour7.service.GestionEtudiantService;

public class Application {

	static Scanner scanner = new Scanner(System.in);
	static GestionEtudiantService gestionEtudiantService = new GestionEtudiantService();

	public static Etudiant saisirEtudiant(Scanner scanner) {
		
		Etudiant e = new Etudiant();

		System.out.println("Id : ");
		int id = scanner.nextInt();
		e.setId(id);

		System.out.println("Nom : ");
		String nom = scanner.next();
		e.setNom(nom);

		System.out.println("Prénom : ");
		String prenom = scanner.next();
		e.setPrenom(prenom);
		
		String email;
		do {
			System.out.println("Email : ");
			email = scanner.next();
			if(!email.contains("@")) {
				System.out.println("Email invalide ! Doit contenir @.");
			}
		} while(!email.contains("@"));
		e.setEmail(email);
		
		double note;
		do {
			System.out.println("Note (entre 0 et 20) : ");
			note = scanner.nextDouble();
			if(note < 0 || note > 20) {
				System.out.println("Note invalide ! Doit être entre 0 et 20.");
			}
		} while(note < 0 || note > 20);
		e.setNote(note);

		System.out.println("Filière : ");
		String filiere = scanner.next();
		e.setFiliere(filiere);

		return e;
	}

	public static void main(String[] args) {

		while (true) {
			System.out.println("===== Gestion Étudiants =====");
			System.out.println("1. Ajouter un étudiant");
			System.out.println("2. Supprimer un étudiant");
			System.out.println("3. Rechercher par nom");
			System.out.println("4. Afficher tous les étudiants");
			System.out.println("5. Afficher les statistiques");
			System.out.println("6. Trier par note");
			System.out.println("7. Quitter");
			System.out.println("==============================");

			System.out.println("Choisissez une optiion : ");
			int option = scanner.nextInt();

			switch (option) {
				case 1 -> {
					System.out.println("Saisissez les informations de l'etudiant : ");
					Etudiant e = saisirEtudiant(scanner);
					gestionEtudiantService.ajouterEtudiant(e);
				}
				case 2 -> {
					System.out.println("Saisissez l'id de l'étudiant à supprimer : ");
					int id = scanner.nextInt();
					gestionEtudiantService.supprimerEtudiant(id);
	
				}
				case 3 -> {
					System.out.println("Saisissez le nom de l'étudiant à rechercher : ");
					String nom = scanner.next();
					List<Etudiant> etudiants = gestionEtudiantService.rechercherParNom(nom);
					for (Etudiant etudiant : etudiants) {
						System.out.println(etudiant);
					}
	
				}
				case 4 -> {
					System.out.println("La liste de tous les étudiants : ");
					gestionEtudiantService.afficherTous();
	
				}
				case 5 -> {
					System.out.println("Les statistiques : ");
					gestionEtudiantService.afficherStatistiques();
	
				}
				case 6 -> {
					System.out.println("La listes des etudiants trie par note : ");
					gestionEtudiantService.trierParNote();
					gestionEtudiantService.afficherTous();
				}
				case 7 -> {
					System.out.println("Au revoir ! ");
				    scanner.close();
				    return; 
				}

			}
		}

	}

}
