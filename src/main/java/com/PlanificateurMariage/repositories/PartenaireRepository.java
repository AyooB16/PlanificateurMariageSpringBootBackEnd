package com.PlanificateurMariage.repositories;


import com.PlanificateurMariage.entities.Partenaire;

import jakarta.transaction.Transactional;


@Transactional
public interface PartenaireRepository extends BaseRepository<Partenaire>{

}