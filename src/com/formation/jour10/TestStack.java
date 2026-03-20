package com.formation.jour10;

public class TestStack {

	public static void main(String[] args) {
		// Test 1 — Stack de String :
		Stack<String> stackString = new Stack<>();
		
		// Pousser 3 éléments : "Java", "Python", "Spring"
		stackString.push("Java");
		stackString.push("Python");
		stackString.push("Spring");
		
		// Afficher la taille
		System.out.println("La taille de la stack est : " + stackString.size());
		
		// Afficher le sommet avec peek()
		System.out.println("Afficher le sommet : " + stackString.peek());
		
		// Dépiler avec pop() et afficher ce qui est retiré
		System.out.println("Afficher ce qui est retiré : " + stackString.pop());
		
		// Afficher la pile après
		System.out.println(stackString);
		
		// Stack d'Integer :
		Stack<Integer> stackInteger = new Stack<>();
		
		// Pousser 10, 20, 30
		stackInteger.push(10);
		stackInteger.push(20);
		stackInteger.push(30);
		
		// Vider la pile avec une boucle while et afficher chaque élément retiré
		while(!stackInteger.isEmpty()) {
			System.out.println("Nous avons retiré l'élément : " + stackInteger.pop());
		}

		// Vérifier avec isEmpty()
		if(stackInteger.isEmpty()) System.out.println("la pile est vide.");
		else System.out.println("La pile n'est pas vide.");

	}

}
