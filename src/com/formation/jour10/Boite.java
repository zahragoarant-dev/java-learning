package com.formation.jour10;

public class Boite<T> {
	private T contenu;
	
	public Boite() {
		
	}
	
	public void mettre (T contenu) {
		this.contenu = contenu;
	}
	
	public T ouvrir() {
		return contenu;
	}
	
	public boolean estVide() {
		return contenu == null;
	}

	@Override
	public String toString() {
		return "Boite [contenu=" + contenu + "]";
	}

}
