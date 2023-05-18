package com.PlanificateurMariage.services;

import java.util.List;

import com.PlanificateurMariage.entities.Commande;

public interface ICommandeService {
	public List<Commande> findAllCommande();
	public Commande findCommande(int id);
	public Commande saveCommande(Commande commande);
	public boolean deleteCommande(int id);
	public Commande updateCommande(Commande commande,int id);

}
