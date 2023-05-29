package com.PlanificateurMariage.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Client extends User implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private String prenom;

	@Temporal(TemporalType.DATE)
	private LocalDate dateNaissance;
	private String password;
	@OneToMany(mappedBy = "client", fetch= FetchType.EAGER ,  cascade = CascadeType.REMOVE)
	private List<Commande> commandes;

	public Client() {
		super();
	}
	
	public Client(String password,String nom,String prenom, LocalDate dateNaissance, String email, String tel, String rue, String ville, String region, String codePostal) {
		super(nom, email, tel, rue, ville, region, codePostal);
		this.prenom = prenom;
		this.password=password;
		this.dateNaissance = dateNaissance;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	
	
	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [idUser=" + getIdUser() + ", nom=" + getNom() +", prenom=" + prenom + ", dateNaissance=" + dateNaissance+ ", email=" + getEmail() +", password="+password+ ", tel=" + getTel() + ", rue=" + getRue()
				+ ", ville=" + getVille() + ", region=" + getRegion() + ", codePostal=" + getCodePostal() + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
