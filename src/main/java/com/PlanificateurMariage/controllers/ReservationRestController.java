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

import com.PlanificateurMariage.entities.Reservation;
import com.PlanificateurMariage.services.ReservationService;

@CrossOrigin("*")
@RestController
@RequestMapping
public class ReservationRestController {
	@Autowired
	ReservationService ReservationService;
	
	public ReservationRestController(ReservationService reservationService) {
		super();
		ReservationService = reservationService;
	}
	@GetMapping("/reservations")
	public List<Reservation> getAllReservation(){
		return ReservationService.findAllReservation();
		
	}
	@PostMapping("/reservations")
	public boolean postReservation(@RequestBody Reservation Reservation) {
		return ReservationService.saveReservation(Reservation);
	}
    @GetMapping("reservations/{id}")
    public Optional<Reservation> one(@PathVariable int id)
    {
        return Optional.ofNullable(ReservationService.findReservation(id));
    }
    
    @PutMapping("reservations/{id}")
    Reservation replaceReservation(@RequestBody Reservation newReservation ,@PathVariable int id )
    {
         newReservation.setIdReservation(id);
         
         return ReservationService.updateReservation(newReservation, id);
    }
    @DeleteMapping("reservations/{id}")
    boolean DeleteReservation(@PathVariable int id )
    {
    	return ReservationService.deleteReservation(id);
    }
}