package com.formation.jour10;

import java.util.List;

import com.formation.jour7.model.Etudiant;

public class TestRepository {

	public static void main(String[] args) {
		// Créer un EtudiantRepository
		EtudiantRepository etudiantRepository = new EtudiantRepository();
		
		// Sauvegarder 3 étudiants avec save()
		Etudiant e1 = new Etudiant(1, "Hamdane", "Zahra", "zahra.hamdane@gmail.com", 17, "Java");
		Etudiant e2 = new Etudiant(2, "Goarant", "Robert", "robert.goarant@gmail.com", 20, "Python");
		Etudiant e3 = new Etudiant(3, "Alaoui", "Rajaa", "rajaa.alaoui@gmail.com", 15, "Spring");

		etudiantRepository.save(e1);
		etudiantRepository.save(e2);
		etudiantRepository.save(e3);

		// Afficher le nombre avec count()
		System.out.println(etudiantRepository.count());	
		
		// Afficher tous avec findAll()
		List<Etudiant> etudiants = etudiantRepository.findAll();
		for(Etudiant etudiant : etudiants) {
			System.out.println(etudiant);
		}
		
		// Trouver un étudiant par id avec findById()
		System.out.println(etudiantRepository.findById(1));
		
		// Supprimer un étudiant avec delete()
		etudiantRepository.delete(3);
		
		// Vérifier avec count() après suppression
		System.out.println(etudiantRepository.count());

		


	}

}
