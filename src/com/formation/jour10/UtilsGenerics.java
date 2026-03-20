package com.formation.jour10;

import java.util.List;

public class UtilsGenerics {
	
	// Affiche tous les éléments d'une liste peu importe le type
	public static <T> void afficherTous(List<T> liste) {
		
		for(T t : liste) {
			System.out.println(t);
		}
	}
	
	// Échange deux éléments d'une liste par leurs index
	public static <T> void swap(List<T> liste, int i, int j) {
		T temp = liste.get(i);
		liste.set(i, liste.get(j));
		liste.set(j, temp);
	}

}
