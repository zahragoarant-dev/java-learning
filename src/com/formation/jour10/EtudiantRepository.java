package com.formation.jour10;

import java.util.ArrayList;
import java.util.List;

import com.formation.jour7.model.Etudiant;

public class EtudiantRepository implements Repository<Etudiant, Integer> {
	
	List<Etudiant> etudiants = new ArrayList<>();

	@Override
	public void save(Etudiant entity) {
		etudiants.add(entity);
	}

	@Override
	public Etudiant findById(Integer id) {
		for(Etudiant etudiant : etudiants) {
			if(etudiant.getId() == id) return etudiant;
		}
		return null;
	}

	@Override
	public List<Etudiant> findAll() {
		return etudiants;
	}

	@Override
	public void delete(Integer id) {
		for(int i= 0; i< etudiants.size(); i++) {
			if(etudiants.get(i).getId() == id) {
				etudiants.remove(i);
				break;
			}
		}
	}

	@Override
	public int count() {
		return etudiants.size();
	}

}
