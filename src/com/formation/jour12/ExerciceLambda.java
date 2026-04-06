package com.formation.jour12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExerciceLambda {

	public static void main(String[] args) {

		System.out.println("Exercice 1 ");

		// Un Predicate<Integer> qui vérifie si un nombre est positif
		Predicate<Integer> isPositif = number -> number >= 0;

		// Un Predicate<Integer> qui vérifie si un nombre est pair
		Predicate<Integer> isPair = number -> (number % 2 == 0);

		// Un Predicate<String> qui vérifie si une chaîne contient "@"
		Predicate<String> isMail = s -> s.contains("@");

		System.out.println("Vérifie si un nombre est positif : " + isPositif.test(5));
		System.out.println("Vérifie si un nombre est positif : " + isPositif.test(-1));

		System.out.println("Vérifie si un nombre est pair : " + isPair.test(5));
		System.out.println("Vérifie si un nombre est pair : " + isPair.test(10));

		System.out.println("Vérifie si une chaîne contient \"@\" : " + isMail.test("zahra.goarant@gmail.com"));
		System.out.println("Vérifie si une chaîne contient \"@\" : " + isMail.test("zahra.goarant"));

		System.out.println("Exercice 2 ");

		// Une `Function<String, Integer>` qui retourne la **longueur** d'une chaîne
		Function<String, Integer> longueur = s -> s.length();

		// Une `Function<Integer, Integer>` qui retourne le **carré** d'un nombre
		Function<Integer, Integer> carreNumber = n -> n * n;

		// Une `Function<String, String>` qui met une chaîne en **majuscules**
		Function<String, String> chaineMajuscule = s -> s.toUpperCase();

		System.out.println("Retourne la **longueur** d'une chaîne : " + longueur.apply("Zahra"));
		System.out.println("Retourne le **carré** d'un nombre : " + carreNumber.apply(5));
		System.out.println("Met une chaîne en **majuscules** : " + chaineMajuscule.apply("zahra"));

		System.out.println("Exercice 3");

		// Un Consumer<String> qui affiche une chaîne en majuscules
		Consumer<String> chaineEnMajuscules = s -> System.out.println("Afficher la chaine " + s + " en majuscules : " + s.toUpperCase());

		// Un Consumer<Integer> qui affiche si un nombre est pair ou impair
		Consumer<Integer> nombreEstPairOuImpair = n -> {
			if(n%2 == 0) System.out.println("Le nimbre " + n + " est pair.");
			else System.out.println("Le nombre " + n + " est impair.");
		};
		
		chaineEnMajuscules.accept("zahra");
		nombreEstPairOuImpair.accept(5);
		
		System.out.println("Exercice 4");
		
		// Un Supplier<String> qui retourne "Bonjour Zahra !"
		Supplier<String> s = () -> "Bonjour Zahra !";
		
		// Un Supplier<Integer> qui retourne un nombre aléatoire entre 0 et 20
		Supplier<Integer> nombreAleatoire = () -> (int) (Math.random() * 21);
		
		System.out.println(s.get());
		System.out.println("Retourne un nombre aléatoire entre 0 et 20 : " + nombreAleatoire.get());

	}

}
