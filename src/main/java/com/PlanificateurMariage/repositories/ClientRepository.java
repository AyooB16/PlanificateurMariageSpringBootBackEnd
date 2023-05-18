package com.PlanificateurMariage.repositories;


import com.PlanificateurMariage.entities.Client;

import jakarta.transaction.Transactional;


@Transactional
public interface ClientRepository extends BaseRepository<Client>{

}
