package com.PlanificateurMariage.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class TypePartenaire implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTypePartenaire;
	private String libelle;
	private String image;

	@OneToMany(mappedBy = "typePartenaire", fetch= FetchType.EAGER ,  cascade = CascadeType.REMOVE)
	private List<Partenaire> partenaires;
	
	
	public TypePartenaire() {

	}
	public TypePartenaire(String libelle ,String image) {
		this.libelle = libelle;
		this.image=image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getIdTypePartenaire() {
		return idTypePartenaire;
	}
	public void setIdTypePartenaire(int idTypePartenaire) {
		this.idTypePartenaire = idTypePartenaire;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	public List<Partenaire> getPartenaires() {
		return partenaires;
	}
	public void setPartenaires(List<Partenaire> partenaires) {
		this.partenaires = partenaires;
	}
	@Override
	public String toString() {
		return "TypePartenaire [idTypePartenaire=" + idTypePartenaire + ", libelle=" + libelle + "]";
	}
	
	
}
