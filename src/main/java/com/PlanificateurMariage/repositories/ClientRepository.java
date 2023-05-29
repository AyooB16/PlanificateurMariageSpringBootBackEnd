package com.PlanificateurMariage.repositories;


import java.util.List;

import com.PlanificateurMariage.entities.Client;

import jakarta.transaction.Transactional;


@Transactional
public interface ClientRepository extends BaseRepository<Client>{

	Client findByEmail(String email);

}
