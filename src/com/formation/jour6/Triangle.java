package com.formation.jour6;

public class Triangle extends Forme implements Dessinable {
	
	private double base;
	private double hauteur;
	private double cote;

	
	public Triangle() {
		super();
	}

	public Triangle(String couleur, double base, double hauteur, double cote) {
		super(couleur);
		this.base = base;
		this.hauteur = hauteur;
		this.cote = cote;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	@Override
	public void dessiner() {
		System.out.println("Dessin d'un triangle de base " + getBase());
	}

	@Override
	public double calculerSurface() {
		return (getBase() * getHauteur()) / 2;
	}

	@Override
	public double calculerPerimetre() {
		return getBase() + 2 * getCote();
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", hauteur=" + hauteur + ", cote=" + cote + "]";
	}

}
