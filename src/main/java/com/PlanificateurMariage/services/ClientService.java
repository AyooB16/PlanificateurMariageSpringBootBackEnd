package com.PlanificateurMariage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PlanificateurMariage.entities.Client;
import com.PlanificateurMariage.repositories.ClientRepository;

@Service
public class ClientService implements IClientService{
	@Autowired
    private ClientRepository clientRepository;
	  
	  @Override
	  public List<Client> findAllClient()
	  {
		  return clientRepository.findAll();
	  }
	  
	  @Override
	  public Client findClient(int id)
	  {
		  Optional<Client> e=clientRepository.findById(id);
		  if(e.isPresent())
			  return e.get();
		  else
			  return null;
	  }
	  
	  @Override
	  public boolean saveClient(Client e)
	  {
		  if(clientRepository.save(e)!=null)
			  return true;
		  else
			  return false;
	  }

	  
	  @Override
	  public boolean deleteClient(int id)
	  {
		  clientRepository.deleteById(id);
		  return !clientRepository.existsById(id);
	  }
	  
	  @Override
	  public Client updateClient(Client e, int id)
	  {
		  e.setIdUser(id);;
		  clientRepository.save(e);
		  return clientRepository.findById(id).get();
	  }
}
