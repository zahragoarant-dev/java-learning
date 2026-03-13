package com.formation.jour4;

public class Etudiant {
	// Attributs
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private double note;

	// Constructeurs
	public Etudiant(int id, String nom, String prenom, String email, double note) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.note = note;
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
		if (email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Email invalide ! Doit contenir @");
		}
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {

		if (note >= 0 && note <= 20) {
			this.note = note;
		} else {
			System.out.println("Note invalide ! Doit être entre 0 et 20");
		}
	}

	public boolean estAdmis() {
		return note >= 10;
	}

	public void afficherProfil() {
		System.out.println("===== Profil Étudiant =====");
		System.out.println("ID        : " + this.id);
		System.out.println("Nom       : " + this.nom);
		System.out.println("Prénom    : " + this.prenom);
		System.out.println("Email     : " + this.email);
		System.out.println("Note      : " + this.note + "/20");
		System.out.println("Statut    : " + (estAdmis() ? "Admis" : "Refus"));
		System.out.println("===========================");
	}

	@Override
	public String toString() {
		return "Etudiant{id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", note=" + note
				+ "}";
	}

}
