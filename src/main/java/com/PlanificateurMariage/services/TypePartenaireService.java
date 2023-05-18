package com.PlanificateurMariage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PlanificateurMariage.entities.TypePartenaire;
import com.PlanificateurMariage.repositories.TypePartenaireRepository;

@Service
public class TypePartenaireService implements ITypePartenaireService{
	@Autowired
    private TypePartenaireRepository typePartenaireRepository;
	  
	  @Override
	  public List<TypePartenaire> findAllTypePartenaire()
	  {
		  return typePartenaireRepository.findAll();
	  }
	  
	  @Override
	  public TypePartenaire findTypePartenaire(int id)
	  {
		  Optional<TypePartenaire> e=typePartenaireRepository.findById(id);
		  if(e.isPresent())
			  return e.get();
		  else
			  return null;
	  }
	  
	  @Override
	  public boolean saveTypePartenaire(TypePartenaire e)
	  {
	
		  if( typePartenaireRepository.save(e)!=null)
			  return true;
		  else
			  return false;

	  }

	  
	  @Override
	  public boolean deleteTypePartenaire(int id)
	  {
		  typePartenaireRepository.deleteById(id);
		  return !typePartenaireRepository.existsById(id);
	  }
	  
	  @Override
	  public TypePartenaire updateTypePartenaire(TypePartenaire e, int id)
	  {
		  e.setIdTypePartenaire(id);;
		  typePartenaireRepository.save(e);
		  return typePartenaireRepository.findById(id).get();
	  }
}
