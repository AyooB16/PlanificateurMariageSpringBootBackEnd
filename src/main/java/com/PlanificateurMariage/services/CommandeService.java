package com.PlanificateurMariage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlanificateurMariage.entities.Commande;
import com.PlanificateurMariage.entities.Reservation;
import com.PlanificateurMariage.repositories.CommandeRepository;
import com.PlanificateurMariage.repositories.ReservationRepository;

@Service
public class CommandeService implements ICommandeService{
	@Autowired
    private CommandeRepository commandeRepository;
	@Autowired
    private ReservationRepository reservationRepository; 
	  @Override
	  public List<Commande> findAllCommande()
	  {
		  return commandeRepository.findAll();
	  }
	  
	  @Override
	  public Commande findCommande(int id)
	  {
		  Optional<Commande> e=commandeRepository.findById(id);
		  if(e.isPresent())
			  return e.get();
		  else
			  return null;
	  }
	  
	  @Override
	  public Commande saveCommande(Commande e)
	  {
		  Commande c=commandeRepository.save(e);
		  for (int i = 0; i < c.getReservations().size(); i += 1) {
			  c.getReservations().get(i).setCommande(c);
			  reservationRepository.save(c.getReservations().get(i));
			}
		  return commandeRepository.save(e);
	  }

	  
	  @Override
	  public boolean deleteCommande(int id)
	  {
		  commandeRepository.deleteById(id);
		  return !commandeRepository.existsById(id);
	  }
	  
	  @Override
	  public Commande updateCommande(Commande e, int id)
	  {
		  e.setIdCommande(id);;
		  commandeRepository.save(e);
		  return commandeRepository.findById(id).get();
	  }
}
