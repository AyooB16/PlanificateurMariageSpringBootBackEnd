package com.PlanificateurMariage.services;

import java.util.List;

import com.PlanificateurMariage.entities.Reservation;

public interface IReservationService {
	public List<Reservation> findAllReservation();
	public Reservation findReservation(int id);
	public boolean saveReservation(Reservation reservation);
	public boolean deleteReservation(int id);
	public Reservation updateReservation(Reservation reservation,int id);
}
