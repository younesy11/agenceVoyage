package com.inti.model;

import java.time.LocalDate;

public class Voyageur {
	Long idVoyageur;
	String nom;
	String prenom;
	int age;

	
	public Voyageur(Long idVoyageur, String nom, String prenom,int age) {
		
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		
}
}
