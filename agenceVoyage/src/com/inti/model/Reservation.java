package com.inti.model;
import java.time.LocalDate;
public class Reservation {
	Long idVoyageur;
	LocalDate dateReservation;
	int nbJour;

	
	public Reservation(Long idVoyageur, LocalDate dateReservation, int nbJour) {
		
		this.idVoyageur = idVoyageur;
		this.dateReservation = dateReservation;
		this.nbJour = nbJour;
		
}

}
