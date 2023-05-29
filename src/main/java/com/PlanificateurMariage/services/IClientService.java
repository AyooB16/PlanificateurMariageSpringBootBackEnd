package com.PlanificateurMariage.services;

import java.util.List;

import com.PlanificateurMariage.entities.Client;


public interface IClientService {
	public List<Client> findAllClient();
	public Client findClient(int id);
	public boolean saveClient(Client client);
	public boolean deleteClient(int id);
	public Client updateClient(Client client,int id);
	public Client login(String email,String password);
}
