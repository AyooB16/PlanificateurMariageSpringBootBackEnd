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

import com.PlanificateurMariage.entities.Client;
import com.PlanificateurMariage.services.ClientService;

@CrossOrigin("*")
@RestController
@RequestMapping
public class ClientRestController {
	@Autowired
	ClientService ClientService;
	
	public ClientRestController(ClientService clientService) {
		super();
		ClientService = clientService;
	}
	@GetMapping("/clients")
	public List<Client> getAllClient(){
		return ClientService.findAllClient();
		
	}
	@PostMapping("/login")
	public Client postLogin(@RequestBody Client logOj) {
		return ClientService.login(logOj.getEmail(),logOj.getPassword());
	}
	@PostMapping("/clients")
	public boolean postClient(@RequestBody Client Client) {
		return ClientService.saveClient(Client);
	}
    @GetMapping("clients/{id}")
    public Optional<Client> one(@PathVariable int id)
    {
        return Optional.ofNullable(ClientService.findClient(id));
    }
    
    @PutMapping("clients/{id}")
    Client replaceClient(@RequestBody Client newClient ,@PathVariable int id )
    {
         newClient.setIdUser(id);
         
         return ClientService.updateClient(newClient, id);
    }
    @DeleteMapping("clients/{id}")
    boolean DeleteClient(@PathVariable int id )
    {
    	return ClientService.deleteClient(id);
    }
}