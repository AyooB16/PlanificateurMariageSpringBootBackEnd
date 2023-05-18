package com.PlanificateurMariage.services;

import java.util.List;

import com.PlanificateurMariage.entities.Partenaire;

public interface IPartenaireService {
	public List<Partenaire> findAllPartenaire();
	public Partenaire findPartenaire(int id);
	public boolean savePartenaire(Partenaire partenaire);
	public boolean deletePartenaire(int id);
	public Partenaire updatePartenaire(Partenaire partenaire,int id);

}
