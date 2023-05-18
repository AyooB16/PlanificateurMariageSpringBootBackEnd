package com.PlanificateurMariage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlanificateurMariage.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {

}
