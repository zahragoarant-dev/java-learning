package com.formation.jour3;

public class IntroTableaux {

    public static void main(String[] args) {

        // Déclaration et initialisation
        int[] notes = {14, 16, 12, 18, 10};

        // Accéder à un élément (index commence à 0 !)
        System.out.println("Première note : " + notes[0]);
        System.out.println("Dernière note : " + notes[4]);

        // Taille du tableau
        System.out.println("Nombre de notes : " + notes.length);

        // Parcourir avec for classique
        System.out.println("--- Toutes les notes ---");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Note " + (i + 1) + " : " + notes[i]);
        }

        // Parcourir avec for-each (plus lisible)
        System.out.println("--- For-each ---");
        for (int note : notes) {
            System.out.println(note);
        }

        // Calculer la moyenne avec une méthode
        double moyenne = calculerMoyenne(notes);
        System.out.println("Moyenne : " + moyenne);
    }

    static double calculerMoyenne(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return (double) somme / tableau.length;
    }
}