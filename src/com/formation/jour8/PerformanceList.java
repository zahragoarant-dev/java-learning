package com.formation.jour8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceList {

	public static void main(String[] args) {
		// Mesurer le temps d'insertion de 10 000 éléments en tête de liste pour chaque type :
		// Mesurer le temps en millisecondes
		// Test 1 — ArrayList :
		long debut1 = System.currentTimeMillis();
		List<Integer> numbers1 = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			numbers1.add(0, i);
		}
		long fin1 = System.currentTimeMillis();
		System.out.println("Temps : " + (fin1 - debut1) + " ms");

		// Test 2 — ArrayList :
		long debut2 = System.currentTimeMillis();
		List<Integer> numbers2 = new LinkedList<>();
		for (int i = 0; i < 10000; i++) {
			numbers2.add(0, i);
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps : " + (fin2 - debut2) + " ms");
	}

}
