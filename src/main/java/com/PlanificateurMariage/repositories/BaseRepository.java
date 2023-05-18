package com.PlanificateurMariage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.PlanificateurMariage.entities.User;


@NoRepositoryBean
public interface BaseRepository  <T extends User> extends JpaRepository<T,Integer>{

}
