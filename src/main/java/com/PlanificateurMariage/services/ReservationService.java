package com.PlanificateurMariage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlanificateurMariage.entities.Reservation;
import com.PlanificateurMariage.repositories.ReservationRepository;

@Service
public class ReservationService implements IReservationService {
	@Autowired
    private ReservationRepository reservationRepository;
	  
	  @Override
	  public List<Reservation> findAllReservation()
	  {
		  return reservationRepository.findAll();
	  }
	  
	  @Override
	  public Reservation findReservation(int id)
	  {
		  Optional<Reservation> e=reservationRepository.findById(id);
		  if(e.isPresent())
			  return e.get();
		  else
			  return null;
	  }
	  
	  @Override
	  public boolean saveReservation(Reservation e)
	  {
		  if(reservationRepository.save(e)!=null)
			  return true;
		  else
			  return false;
	  }

	  
	  @Override
	  public boolean deleteReservation(int id)
	  {
		  reservationRepository.deleteById(id);
		  return !reservationRepository.existsById(id);
	  }
	  
	  @Override
	  public Reservation updateReservation(Reservation e, int id)
	  {
		  e.setIdReservation(id);;
		  reservationRepository.save(e);
		  return reservationRepository.findById(id).get();
	  }
}
