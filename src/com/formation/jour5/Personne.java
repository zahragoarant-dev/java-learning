package com.formation.jour5;

public class Personne {

	private String nom;
	private String prenom;
	private String email;
	private int age;

	public Personne() {

	}

	public Personne(String nom, String prenom, String email, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.age = age;
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
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sePresenter() {
		System.out.println("Je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans");
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", age=" + age + "]";
	}

}
