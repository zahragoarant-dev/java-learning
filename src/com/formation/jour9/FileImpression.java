package com.formation.jour9;

import java.util.LinkedList;
import java.util.Queue;

public class FileImpression {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		// Ajouter 4 documents avec offer()
		queue.offer("doc1");
		queue.offer("doc2");
		queue.offer("doc3");
		queue.offer("doc4");

		// Afficher le premier document sans le supprimer avec peek()
		System.out.println(queue.peek());
		System.out.println(queue.size());

		// Traiter les documents un par un avec poll() dans une boucle
		while (!queue.isEmpty()) {
			System.out.println("Traitement : " + queue.poll());
		}

		// Vérifier si la file est vide avec isEmpty()
		System.out.println(queue.isEmpty());
		
	}

}
