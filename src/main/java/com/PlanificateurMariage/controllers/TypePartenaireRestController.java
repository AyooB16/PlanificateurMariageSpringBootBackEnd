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

import com.PlanificateurMariage.entities.TypePartenaire;
import com.PlanificateurMariage.services.TypePartenaireService;

@CrossOrigin("*")
@RestController
@RequestMapping
public class TypePartenaireRestController {
	@Autowired
	TypePartenaireService TypePartenaireService;
	
	public TypePartenaireRestController(TypePartenaireService typePartenaireService) {
		super();
		TypePartenaireService = typePartenaireService;
	}
	@GetMapping("/typepartenaires")
	public List<TypePartenaire> getAllTypePartenaire(){
		return TypePartenaireService.findAllTypePartenaire();
		
	}
	@PostMapping("/typepartenaires")
	public boolean postTypePartenaire(@RequestBody TypePartenaire TypePartenaire) {
		return TypePartenaireService.saveTypePartenaire(TypePartenaire);
	}
    @GetMapping("typepartenaires/{id}")
    public Optional<TypePartenaire> one(@PathVariable int id)
    {
        return Optional.ofNullable(TypePartenaireService.findTypePartenaire(id));
    }
    
    @PutMapping("typepartenaires/{id}")
    TypePartenaire replaceTypePartenaire(@RequestBody TypePartenaire newTypePartenaire ,@PathVariable int id )
    {
         newTypePartenaire.setIdTypePartenaire(id);
         
         return TypePartenaireService.updateTypePartenaire(newTypePartenaire, id);
    }
    @DeleteMapping("typepartenaires/{id}")
    boolean DeleteTypePartenaire(@PathVariable int id )
    {
    	return TypePartenaireService.deleteTypePartenaire(id);
    }
}