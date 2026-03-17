package com.formation.jour7.service;

import java.util.ArrayList;
import java.util.List;

import com.formation.jour7.model.Etudiant;

public class GestionEtudiantService {

	private List<Etudiant> etudiants = new ArrayList<>();

	// ajouterEtudiant(Etudiant e) — ajouter à la liste
	public void ajouterEtudiant(Etudiant e) {
		etudiants.add(e);
		System.out.println("Etudiant ajouté.");
	}

	// supprimerEtudiant(int id) — chercher par id, supprimer si trouvé, afficher
	// message si introuvable
	public void supprimerEtudiant(int id) {
		int nbrEtudiants = etudiants.size();

		for (int i = 0; i < nbrEtudiants; i++) {
			if (etudiants.get(i).getId() == id) {
				etudiants.remove(i);
				System.out.println("L'étudiant avec l'ID " + id + " a été supprimé.");
				break;
			}
		}

		if (etudiants.size() == nbrEtudiants)
			System.out.println("Etudiant introvable !");
	}

	// rechercherParNom(String nom) — retourner List<Etudiant> dont le nom contient
	// la recherche
	public List<Etudiant> rechercherParNom(String nom) {

		List<Etudiant> listetudiantsRecherchesParNom = new ArrayList<>();
		for (Etudiant etudiant : etudiants) {
			if (etudiant.getNom().toLowerCase().contains(nom.toLowerCase()))
				listetudiantsRecherchesParNom.add(etudiant);
		}
		return listetudiantsRecherchesParNom;
	}

	// rechercherParId(int id) — retourner l'étudiant ou null si introuvable
	public Etudiant rechercherParId(int id) {
		for (Etudiant etudiant : etudiants) {
			if (etudiant.getId() == id)
				return etudiant;
		}
		return null;
	}

	// afficherTous() — afficher tous les étudiants avec toString()
	public void afficherTous() {
		for (Etudiant etudiant : etudiants) {
			System.out.println(etudiant);
		}
	}

	// calculerMoyenne() — retourner la moyenne de toutes les notes
	public double calculerMoyenne() {
		double somme = 0;
		for (Etudiant etudiant : etudiants) {
			somme += etudiant.getNote();
		}
		return somme / etudiants.size();
	}

	// trierParNote() — trier par note décroissante
	public void trierParNote() {
		etudiants.sort((e1, e2) -> Double.compare(e2.getNote(), e1.getNote()));
	}

	// afficherStatistiques() — afficher moyenne, meilleur étudiant, nombre d'admis
	public void afficherStatistiques() {
		// Afficher moyenne
		System.out.println("La moyenne de toutes les notes : " + String.format("%.2f", calculerMoyenne()) + "/20");

		// meilleur étudiant
		trierParNote();
		System.out.println("Le meilleur etudiant : " + etudiants.get(0));

		// nombre d'admis
		int nbrAdmis = 0;
		for (Etudiant etudiant : etudiants) {
			if (etudiant.estAdmis()) {
				nbrAdmis += 1;
			}
		}
		
		System.out.println("Le nombre d'admis : " + nbrAdmis);
	}
}
