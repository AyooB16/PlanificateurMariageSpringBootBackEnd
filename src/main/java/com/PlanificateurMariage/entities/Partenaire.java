package com.PlanificateurMariage.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Partenaire extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name = "idTypePartenaire")
	private TypePartenaire typePartenaire;
	
	@OneToMany(mappedBy = "partenaire", fetch= FetchType.EAGER ,  cascade = CascadeType.REMOVE)
	private List<Service> services;
	
	public Partenaire() {
		super();
	}

	public Partenaire(String nom, String email, String tel, String rue, String ville, String region,
			String codePostal) {
		super(nom, email, tel, rue, ville, region, codePostal);
	}

	
	@Override
	public String toString() {
		return "Partenaire [idUser=" + getIdUser() + ", nom=" + getNom() + ", email=" + getEmail() + ", tel=" + getTel() + ", rue=" + getRue()
				+ ", ville=" + getVille() + ", region=" + getRegion() + ", codePostal=" + getCodePostal() + "]";
	}

//	public TypePartenaire getTypePartenaire() {
//		return typePartenaire;
//	}

	public void setTypePartenaire(TypePartenaire typePartenaire) {
		this.typePartenaire = typePartenaire;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	
	
}
