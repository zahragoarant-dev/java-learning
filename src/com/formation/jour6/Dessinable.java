package com.formation.jour6;

public interface Dessinable {
	
	void dessiner();
	
	default void effacer(){
		System.out.println("Effacement de la forme...");
	}
}
