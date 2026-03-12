package com.formation.jour2;

public class Boucles {
	public static void main (String[]  args ) {
		// Compter de 1 à 5
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Tour numéro : " + i);
		}
		
		// Décompte
		int compte = 5;

		while (compte > 0) {
		    System.out.println("Décompte : " + compte);
		    compte--;  // équivalent à compte = compte - 1
		}
		System.out.println("🚀 Décollage !");
		
		int nombre = 0;

		do {
		    System.out.println("Exécuté au moins une fois, nombre = " + nombre);
		    nombre++;
		} while (nombre < 3);
		
		// break — arrête complètement la boucle
		System.out.println("--- break ---");
		for (int i = 1; i <= 10; i++) {
		    if (i == 5) {
		        System.out.println("On s'arrête à 5 !");
		        break;
		    }
		    System.out.println(i);
		}

		// continue — saute l'itération courante et passe à la suivante
		System.out.println("--- continue ---");
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 == 0) {
		        continue; // on saute les nombres pairs
		    }
		    System.out.println(i); // affiche uniquement les impairs
		}
	}

}
