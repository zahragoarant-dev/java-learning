package com.formation.jour3;

public class IntroMethodes {

    // Méthode sans retour (void) et sans paramètre
    static void afficherBonjour() {
        System.out.println("Bonjour tout le monde !");
    }

    // Méthode avec paramètre
    static void afficherPrenom(String prenom) {
        System.out.println("Bonjour " + prenom + " !");
    }

    // Méthode avec retour
    static int additionner(int a, int b) {
        return a + b;
    }

    // Méthode avec retour et plusieurs paramètres
    static double calculerMoyenne(double note1, double note2, double note3) {
        return (note1 + note2 + note3) / 3;
    }
    
 // Surcharge : même nom, paramètres différents
    static int additionner(int a, int b, int c) {
        return a + b + c;
    }

    static double additionner(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Appel des méthodes
        afficherBonjour();
        afficherPrenom("Zahra");

        int resultat = additionner(5, 3);
        System.out.println("5 + 3 = " + resultat);

        double moyenne = calculerMoyenne(14, 16, 12);
        System.out.println("Moyenne : " + moyenne);
        
        System.out.println("5 + 3 + 2 = " + additionner(5, 3, 2));
        System.out.println("2.5 + 1.5 = " + additionner(2.5, 1.5));
    }
}