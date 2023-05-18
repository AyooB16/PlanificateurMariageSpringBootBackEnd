package com.PlanificateurMariage.services;

import java.util.List;

import com.PlanificateurMariage.entities.Service;

public interface IServiceService {
	public List<Service> findAllService();
	public Service findService(int id);
	public boolean saveService(Service service);
	public boolean deleteService(int id);
	public Service updateService(Service service,int id);
}
