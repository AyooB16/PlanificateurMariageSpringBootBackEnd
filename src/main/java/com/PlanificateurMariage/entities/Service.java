package com.PlanificateurMariage.entities;

import java.io.Serializable;
import java.time.LocalTime;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idService;
	private String libelle;
	private String description;
	private double prix;
	@Temporal(TemporalType.TIME)
	private LocalTime duree;
	private String image;
	@ManyToOne(fetch= FetchType.EAGER )
	@JoinColumn(name = "idPartenaire")
	private Partenaire partenaire;
	
	@OneToMany(mappedBy = "service", fetch= FetchType.EAGER ,  cascade = CascadeType.REMOVE)
	private List<Reservation> reservations;
	
	public Service() {
		
	}

	public Service(String libelle, String description, double prix,String image, LocalTime duree) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.prix = prix;
		this.duree = duree;
		this.image =image;
	}

	public int getIdService() {
		return idService;
	}
	public void setIdService(int idService) {
		this.idService = idService;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalTime getDuree() {
		return duree;
	}

	public void setDuree(LocalTime duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Service [idService=" + idService + ", libelle=" + libelle + ", description=" + description + ", prix="
				+ prix + ", duree=" + duree + ", image="
						+ image + "]";
	}

	//public Partenaire getPartenaire() {
	//	return partenaire;
	//}

	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}

	//public List<Reservation> getReservations() {
//		return reservations;
	//}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
}
