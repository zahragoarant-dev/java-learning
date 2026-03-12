package com.formation.jour2;

public class StructuresControle {

	public static void main(String[] args) {
		int note = 14;

		if (note >= 16) {
		    System.out.println("Mention Très Bien 🏆");
		} else if (note >= 14) {
		    System.out.println("Mention Bien 👍");
		} else if (note >= 12) {
		    System.out.println("Mention Assez Bien 👌");
		} else if (note >= 10) {
		    System.out.println("Admis ✅");
		} else {
		    System.out.println("Refusé ❌");
		}
		
		// Syntaxe : condition ? valeurSiVrai : valeurSiFaux
		String resultat = (note >= 10) ? "Admis" : "Refusé";
		System.out.println("Résultat : " + resultat);
		
		int jour = 3;

		switch (jour) {
		    case 1:
		        System.out.println("Lundi");
		        break;
		    case 2:
		        System.out.println("Mardi");
		        break;
		    case 3:
		        System.out.println("Mercredi");
		        break;
		    case 4:
		        System.out.println("Jeudi");
		        break;
		    case 5:
		        System.out.println("Vendredi");
		        break;
		    default:
		        System.out.println("Week-end 🎉");
		}
		
		// Switch Expression Java 17 — syntaxe avec flèche ->
		int jour2 = 3;

		String nomJour = switch (jour2) {
		    case 1 -> "Lundi";
		    case 2 -> "Mardi";
		    case 3 -> "Mercredi";
		    case 4 -> "Jeudi";
		    case 5 -> "Vendredi";
		    default -> "Week-end 🎉";
		};

		System.out.println("Jour : " + nomJour);
		
		int jour3 = 6;

		String typeJour = switch (jour3) {
		    case 1, 2, 3, 4, 5 -> "Jour de travail 💼";
		    case 6, 7 -> "Week-end 🎉";
		    default -> "Jour inconnu";
		};

		System.out.println(typeJour);
	}

}
