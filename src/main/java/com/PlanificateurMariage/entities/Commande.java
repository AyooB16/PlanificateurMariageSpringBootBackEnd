package com.PlanificateurMariage.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Commande implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCommande;
	private double prixTotal;
	
	@OneToMany(mappedBy = "commande", fetch= FetchType.EAGER, cascade = CascadeType.ALL )
	private List<Reservation> reservations;
	
	@ManyToOne(fetch= FetchType.EAGER )
	@JoinColumn(name = "idClient")
	private Client client;
	
	public Commande() {
		
	}

	public Commande(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	
	
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	//public Client getClient() {
	//	return client;
	//}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", prixTotal=" + prixTotal + "]";
	}
	
}
