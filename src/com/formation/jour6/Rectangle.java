package com.formation.jour6;

public class Rectangle extends Forme implements Dessinable {
	
	private double largeur;
	private double hauteur;

	public Rectangle() {
		super();
	}

	public Rectangle(String couleur, double largeur, double hauteur) {
		super(couleur);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public void dessiner() {
		System.out.println("Dessin d'un rectangle de " + getLargeur() + "x" + getHauteur());
		
	}

	@Override
	public double calculerSurface() {
		return getLargeur() * getHauteur();
	}

	@Override
	public double calculerPerimetre() {
		return 2 * (getLargeur() + getHauteur());
	}

	@Override
	public String toString() {
		return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
	}

}
