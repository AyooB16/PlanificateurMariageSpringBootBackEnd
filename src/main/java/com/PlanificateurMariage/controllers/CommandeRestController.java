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

import com.PlanificateurMariage.entities.Commande;
import com.PlanificateurMariage.services.CommandeService;

@CrossOrigin("*")
@RestController
@RequestMapping
public class CommandeRestController {
	@Autowired
	CommandeService CommandeService;
	
	public CommandeRestController(CommandeService commandeService) {
		super();
		CommandeService = commandeService;
	}
	@GetMapping("/commandes")
	public List<Commande> getAllCommande(){
		return CommandeService.findAllCommande();
		
	}
	@PostMapping("/commandes")
	public Commande postCommande(@RequestBody Commande Commande) {
		return CommandeService.saveCommande(Commande);
	}
    @GetMapping("commandes/{id}")
    public Optional<Commande> one(@PathVariable int id)
    {
        return Optional.ofNullable(CommandeService.findCommande(id));
    }
    
    @PutMapping("commandes/{id}")
    Commande replaceCommande(@RequestBody Commande newCommande ,@PathVariable int id )
    {
         newCommande.setIdCommande(id);
         
         return CommandeService.updateCommande(newCommande, id);
    }
    @DeleteMapping("commandes/{id}")
    boolean DeleteCommande(@PathVariable int id )
    {
    	return CommandeService.deleteCommande(id);
    }
}