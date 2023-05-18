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

import com.PlanificateurMariage.entities.Partenaire;
import com.PlanificateurMariage.services.PartenaireService;

@CrossOrigin("*")
@RestController
@RequestMapping
public class PartenaireRestController {
	@Autowired
	PartenaireService PartenaireService;
	
	public PartenaireRestController(PartenaireService partenaireService) {
		super();
		PartenaireService = partenaireService;
	}
	@GetMapping("/partenaires")
	public List<Partenaire> getAllPartenaire(){
		return PartenaireService.findAllPartenaire();
		
	}
	@PostMapping("/partenaires")
	public boolean postPartenaire(@RequestBody Partenaire Partenaire) {
		return PartenaireService.savePartenaire(Partenaire);
	}
    @GetMapping("partenaires/{id}")
    public Optional<Partenaire> one(@PathVariable int id)
    {
        return Optional.ofNullable(PartenaireService.findPartenaire(id));
    }
    
    @PutMapping("partenaires/{id}")
    Partenaire replacePartenaire(@RequestBody Partenaire newPartenaire ,@PathVariable int id )
    {
         newPartenaire.setIdUser(id);
         
         return PartenaireService.updatePartenaire(newPartenaire, id);
    }
    @DeleteMapping("partenaires/{id}")
    boolean DeletePartenaire(@PathVariable int id )
    {
    	return PartenaireService.deletePartenaire(id);
    }
}