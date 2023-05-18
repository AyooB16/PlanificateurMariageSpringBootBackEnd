package com.PlanificateurMariage.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity

public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idReservation;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime date;
	
	@ManyToOne(fetch= FetchType.EAGER )
	@JoinColumn(name = "idService")
	private Service service;
	
	@ManyToOne(fetch= FetchType.EAGER  )
	@JoinColumn(name = "idCommande",referencedColumnName = "idCommande" )
	private Commande commande;
	
	public Reservation() {
		
	}
	public Reservation(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", date=" + date + "]";
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	//public Commande getCommande() {
	//	return commande;
	//}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	
}
