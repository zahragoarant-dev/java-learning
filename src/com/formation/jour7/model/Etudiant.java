package com.formation.jour7.model;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private double note;
	private String filiere;

	public Etudiant(int id, String nom, String prenom, String email, double note, String filiere) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.note = note;
		this.filiere = filiere;
	}

	public Etudiant() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@"))
			this.email = email;
		else
			System.out.println("Email invalide !");
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		if (note >= 0 && note <= 20)
			this.note = note;
		else
			System.out.println("Note invalide !");
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public boolean estAdmis() {
		return note >= 10;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", note=" + note
				+ ", filiere=" + filiere + "]";
	}

}
