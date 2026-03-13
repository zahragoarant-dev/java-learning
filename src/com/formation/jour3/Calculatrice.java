package com.formation.jour3;

import java.util.Scanner;

public class Calculatrice {

	static String[] historique = new String[5]; // ici
	static int nbCalculs = 0;

	public static void ajouterHistorique(String calcul) {
		if (nbCalculs < 5) {
			historique[nbCalculs] = calcul;
			nbCalculs++;
		} else {
			for (int i = 0; i < historique.length - 1; i++) {
				historique[i] = historique[i + 1];
			}
			historique[historique.length - 1] = calcul;
		}
	}

	public static void afficherHistorique() {
		if (nbCalculs == 0) {
			System.out.println("Aucun calcul effectué.");
		} else {
			for (int i = 0; i < nbCalculs; i++) {
				System.out.println(i + 1 + ". " + historique[i]);
			}
		}
	}

	public static double additionner(double a, double b) {
		return a + b;
	}

	public static double soustraire(double a, double b) {
		return a - b;
	}

	public static double multiplier(double a, double b) {
		return a * b;
	}

	public static double diviser(double a, double b) {
		if (b == 0) {
			System.out.println("Attention à la division par zéro");
			return Double.NaN;
		}
		return a / b;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("===== Calculatrice =====");
			System.out.println("1. Addition");
			System.out.println("2. Soustraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Afficher historique");
			System.out.println("6. Quitter");
			
			System.out.println("Votre choix :");
			int choix = scanner.nextInt();

			if (choix == 5) {
				afficherHistorique();
				continue;
			} else if (choix == 6) {
				break;
			}

			System.out.println("Saisissez les deux nombres à claculer : ");
			System.out.println("Nombre 1 :");
			double a = scanner.nextDouble();
			System.out.println("Nombre 2 :");
			double b = scanner.nextDouble();

			switch (choix) {
			case 1 -> {
				double resultatAddition = additionner(a, b);
				ajouterHistorique(a + " + " + b + " = " + resultatAddition);
				afficherHistorique();
			}
			case 2 -> {
				double resultatSoustraction = soustraire(a, b);
				ajouterHistorique(a + " - " + b + " = " + resultatSoustraction);
				afficherHistorique();
			}
			case 3 -> {
				double resultatMultiplication = multiplier(a, b);
				ajouterHistorique(a + " * " + b + " = " + resultatMultiplication);
				afficherHistorique();
			}
			case 4 -> {
				double resultatDivision = diviser(a, b);
				ajouterHistorique(a + " / " + b + " = " + resultatDivision);
				afficherHistorique();
			}
			}
		}

	}

}
