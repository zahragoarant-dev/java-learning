package com.formation.jour1;

public class HelloWorld {
    public static void main(String[] args) {
        // Types primitifs 
    	int age = 22;
    	double taille = 1.78;
    	boolean estEtudiant = true;
    	char initiale = 'A';
    	
    	// Type objet
    	String prenom = "Ali";
    	
    	// Affichage 
    	System.out.println("Prénom : " + prenom);
    	System.out.println("Âge : " + age);
    	System.out.println("Taille : "  + taille + " m");
    	System.out.println("Étudiant : " + estEtudiant);
    	System.out.println("Initiale : " + initiale);
    	
    	// Java 17 : inférence de type avec var
    	var ville = "Alger";
    	var anneeNaissance = 2002;
    	var moyenne = 14.5;

    	System.out.println("Ville : " + ville);
    	System.out.println("Né en : " + anneeNaissance);
    	System.out.println("Moyenne : " + moyenne);

    }
}