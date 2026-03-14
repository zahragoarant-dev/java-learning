package com.formation.jour5;

public class Etudiant extends Personne {

	private int id;
	private double note;
	private String filiere;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String email, int age, int id, double note, String filiere) {
		super(nom, prenom, email, age);
		this.id = id;
		this.note = note;
		this.filiere = filiere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		System.out.println("Je suis étudiant(e) en " + filiere + ", ma note est " + note + "/20.");
	}

	public boolean estAdmis() {
		return note >= 10;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", note=" + note + ", filiere=" + filiere + "]";
	}

}
