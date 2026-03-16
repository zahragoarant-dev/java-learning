package com.formation.jour6;

public abstract class Forme {
	
	private String couleur;

	public Forme(String couleur) {
		this.couleur = couleur;
	}

	public Forme() {
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public abstract double calculerSurface();
	
	public abstract double calculerPerimetre();
	
	public void afficher() {
		System.out.println("===== Forme =====");
		System.out.println("Couleur   : " + getCouleur());
		System.out.println("Surface   : " + String.format("%.2f", calculerSurface()));
		System.out.println("Périmètre : " + String.format("%.2f", calculerPerimetre()));
		System.out.println("=================");
	}

	@Override
	public String toString() {
		return "Forme [couleur=" + couleur + "]";
	}
	
}
