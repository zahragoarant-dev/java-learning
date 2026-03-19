package com.formation.jour9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequenceMots {

	public static void main(String[] args) {
		String phrase = "java est super java est cool java";
		
		// Découper la phrase en mots avec split(" ")
		String[] mots = phrase.toLowerCase().split(" ");

		// Pour chaque mot, compter combien de fois il apparaît dans une HashMap<String, Integer>
		Map<String, Integer> map = new HashMap<>();
		
		for(String mot : mots) {
			// getOrDefault() retourne la valeur si la clé existe
			// sinon retourne la valeur par défaut (0)
			map.put(mot, map.getOrDefault(mot, 0) + 1);
		}
		
		System.out.println("Fréquence mot : ");
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// Afficher le résultat avec TreeMap pour avoir les mots triés alphabétiquement
		System.out.println("Les mots triés par ordre alphabetique");
		Map<String, Integer> mapTrie = new TreeMap<>(map);
		for(Map.Entry<String, Integer> entry : mapTrie.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
