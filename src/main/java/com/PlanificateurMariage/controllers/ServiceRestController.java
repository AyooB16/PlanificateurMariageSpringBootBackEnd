package com.PlanificateurMariage.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PlanificateurMariage.entities.Service;
import com.PlanificateurMariage.services.ServiceService;

@CrossOrigin("*")
@RestController
@RequestMapping
public class ServiceRestController {
	@Autowired
	ServiceService ServiceService;
	
	public ServiceRestController(ServiceService serviceService) {
		super();
		ServiceService = serviceService;
	}
	@GetMapping("/services")
	public List<Service> getAllService(){
		return ServiceService.findAllService();
		
	}
	@PostMapping("/services")
	public boolean postService(@RequestBody Service Service) {
		return ServiceService.saveService(Service);
	}
    @GetMapping("services/{id}")
    public Optional<Service> one(@PathVariable int id)
    {
        return Optional.ofNullable(ServiceService.findService(id));
    }
    
    @PutMapping("services/{id}")
    Service replaceService(@RequestBody Service newService ,@PathVariable int id )
    {
         newService.setIdService(id);
         
         return ServiceService.updateService(newService, id);
    }
    @DeleteMapping("services/{id}")
    boolean DeleteService(@PathVariable int id )
    {
    	return ServiceService.deleteService(id);
    }
}