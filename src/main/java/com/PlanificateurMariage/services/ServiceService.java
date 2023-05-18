package com.PlanificateurMariage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.PlanificateurMariage.repositories.ServiceRepository;

@Service

public class ServiceService implements IServiceService{
	@Autowired
    private ServiceRepository serviceRepository;
	  
	  @Override
	  public List<com.PlanificateurMariage.entities.Service> findAllService()
	  {
		  return serviceRepository.findAll();
	  }
	  
	  @Override
	  public com.PlanificateurMariage.entities.Service findService(int id)
	  {
		  Optional<com.PlanificateurMariage.entities.Service> e=serviceRepository.findById(id);
		  if(e.isPresent())
			  return e.get();
		  else
			  return null;
	  }
	  
	  @Override
	  public boolean saveService(com.PlanificateurMariage.entities.Service e)
	  {
	
		  if( serviceRepository.save(e)!=null)
			  return true;
		  else
			  return false;

	  }

	  
	  @Override
	  public boolean deleteService(int id)
	  {
		  serviceRepository.deleteById(id);
		  return !serviceRepository.existsById(id);
	  }
	  
	  @Override
	  public com.PlanificateurMariage.entities.Service updateService(com.PlanificateurMariage.entities.Service e, int id)
	  {
		  e.setIdService(id);;
		  serviceRepository.save(e);
		  return serviceRepository.findById(id).get();
	  }





}
