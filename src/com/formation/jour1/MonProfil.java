package com.formation.jour1;

public class MonProfil {

	public static void main(String[] args) {
		String prenom = "Zahra";
		int age = 40;
		String langagePrefere = "Java";
		double anneeExperience = 1.0;
		boolean estEtudiant = false;
		var ville = "Nantes";
		
		System.out.println("===== Mon Profil Développeur =====");
		System.out.println("Prénom      : " + prenom);
		System.out.println("Âge         : " + age);
		System.out.println("Langage     : " + langagePrefere);
		System.out.println("Expérience  : " + anneeExperience + " ans");
		System.out.println("Étudiant    : " + estEtudiant);
		System.out.println("Ville       : " + ville);
		System.out.println("==================================");
	}

}
