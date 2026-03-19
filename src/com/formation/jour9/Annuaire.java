package com.formation.jour9;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {

	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		
		// Ajouter 4 contacts avec put()
		contacts.put("Zahra", "0779984030");
		contacts.put("Robert", "0669984030");
		contacts.put("Ayoub", "077664030");
		contacts.put("Amina", "066774030");
		
		// Afficher tous les contacts avec entrySet()
		for(Map.Entry<String, String> entry : contacts.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// Rechercher un contact par nom avec get()
		System.out.println(contacts.get("Zahra"));
		
		// Vérifier si un contact existe avec containsKey()
		if(contacts.containsKey("Zahra")) System.out.println("Le contact existe.");
		else System.out.println("Le contact n'existe pas.");
		
		// Supprimer un contact avec remove()
		contacts.remove("Zahra");
		System.out.println("Le contact est supprimer.");
		
		// Afficher le nombre de contacts avec size()
		System.out.println("Le nombre de contact : " + contacts.size());
		
	}

}
