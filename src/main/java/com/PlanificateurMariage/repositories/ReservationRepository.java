package com.PlanificateurMariage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PlanificateurMariage.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

}
