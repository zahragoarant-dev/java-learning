package com.formation.jour10;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	
	List<T> elements = new ArrayList<>();
	
	// ajouter en haut de la pile
	public void push(T element) {
		elements.add(element);
	}
	
	// retirer et retourner le dernier élément
	public T pop() {
		return elements.remove(elements.size()-1);
		 
	}
	
	// voir le dernier élément sans le retirer
	public T peek() {
		return elements.get(elements.size()-1);
	}
	
	// vérifier si la pile est vide
	public boolean isEmpty() {
		return elements.isEmpty();
	}
	
	// nombre d'éléments
	public int size() {
		return elements.size();
	}

	@Override
	public String toString() {
		return "Stack [elements=" + elements + "]";
	}

}
