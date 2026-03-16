package com.formation.jour6;

public class Cercle extends Forme implements Dessinable {

	private double rayon;

	public Cercle() {
		super();
	}

	public Cercle(String couleur, double rayon) {
		super(couleur);
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public void dessiner() {
		System.out.println("Dessin d'un cercle de rayon " + rayon);
	}

	@Override
	public double calculerSurface() {
		return Math.PI * rayon * rayon;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

}
