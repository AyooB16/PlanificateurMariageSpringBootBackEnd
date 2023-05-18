package com.PlanificateurMariage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlanificateurMariage.entities.Partenaire;
import com.PlanificateurMariage.repositories.PartenaireRepository;

@Service
public class PartenaireService implements IPartenaireService{
	@Autowired
    private PartenaireRepository partenaireRepository;
	  
	  @Override
	  public List<Partenaire> findAllPartenaire()
	  {
		  return partenaireRepository.findAll();
	  }
	  
	  @Override
	  public Partenaire findPartenaire(int id)
	  {
		  Optional<Partenaire> e=partenaireRepository.findById(id);
		  if(e.isPresent())
			  return e.get();
		  else
			  return null;
	  }
	  
	  @Override
	  public boolean savePartenaire(Partenaire e)
	  {
	
		  if( partenaireRepository.save(e)!=null)
			  return true;
		  else
			  return false;

	  }

	  
	  @Override
	  public boolean deletePartenaire(int id)
	  {
		  partenaireRepository.deleteById(id);
		  return !partenaireRepository.existsById(id);
	  }
	  
	  @Override
	  public Partenaire updatePartenaire(Partenaire e, int id)
	  {
		  e.setIdUser(id);;
		  partenaireRepository.save(e);
		  return partenaireRepository.findById(id).get();
	  }
}
