package com.formation.jour5;

public class Professeur extends Personne {

	private int id;
	private String matiere;
	private double salaire;

	public Professeur() {
		super();
	}

	public Professeur(String nom, String prenom, String email, int age, int id, String matiere, double salaire) {
		super(nom, prenom, email, age);
		this.id = id;
		this.matiere = matiere;
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public void sePresenter() {
		super.sePresenter();
		System.out.println("J'enseigne les " + matiere + ".");
	}

	@Override
	public String toString() {
		return "Professeur [id=" + id + ", matiere=" + matiere + ", salaire=" + salaire + "]";
	}

}
