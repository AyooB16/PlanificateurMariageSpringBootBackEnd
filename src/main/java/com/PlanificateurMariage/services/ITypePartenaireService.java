package com.PlanificateurMariage.services;

import java.util.List;

import com.PlanificateurMariage.entities.TypePartenaire;

public interface ITypePartenaireService {
	public List<TypePartenaire> findAllTypePartenaire();
	public TypePartenaire findTypePartenaire(int id);
	public boolean saveTypePartenaire(TypePartenaire typePartenaire);
	public boolean deleteTypePartenaire(int id);
	public TypePartenaire updateTypePartenaire(TypePartenaire typePartenaire,int id);
}
