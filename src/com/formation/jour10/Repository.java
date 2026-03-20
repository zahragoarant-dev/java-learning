package com.formation.jour10;

import java.util.List;

public interface Repository <T, ID>{
	// sauvegarder
	void save(T entity);
	
	// trouver par ID, retourne null si introuvable
	T findById(ID id);
	
	// retourner tous les éléments
	List<T> findAll();
	
	// supprimer par ID
	void delete(ID id);
	
	// nombre d'éléments
	int count();

}
