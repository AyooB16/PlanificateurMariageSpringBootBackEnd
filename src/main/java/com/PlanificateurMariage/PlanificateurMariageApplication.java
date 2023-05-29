package com.PlanificateurMariage;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.PlanificateurMariage.entities.Partenaire;
import com.PlanificateurMariage.entities.Service;
import com.PlanificateurMariage.entities.TypePartenaire;
import com.PlanificateurMariage.repositories.ClientRepository;
import com.PlanificateurMariage.repositories.CommandeRepository;
import com.PlanificateurMariage.repositories.PartenaireRepository;
import com.PlanificateurMariage.repositories.ReservationRepository;
import com.PlanificateurMariage.repositories.ServiceRepository;
import com.PlanificateurMariage.repositories.TypePartenaireRepository;


@SpringBootApplication
public class PlanificateurMariageApplication implements CommandLineRunner{
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private PartenaireRepository partenaireRepository;
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private TypePartenaireRepository typePartenaireRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(PlanificateurMariageApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
		TypePartenaire tp1 = new TypePartenaire("Salle de mariage","image1");
		TypePartenaire tp2 = new TypePartenaire("Fleuriste","image1");
		TypePartenaire tp3 = new TypePartenaire("Maquillage & Coiffure mariage","image1");
		TypePartenaire tp4 = new TypePartenaire("Photographe","image1");
		TypePartenaire tp5 = new TypePartenaire("Invitation de mariage","image1");
		TypePartenaire tp6 = new TypePartenaire("Véhicules du mariage","image1");
		TypePartenaire tp7 = new TypePartenaire("Dragées","image1");
		TypePartenaire tp8 = new TypePartenaire("Hammam","image1");
		TypePartenaire tp9 = new TypePartenaire("Patisserie","image1");
		TypePartenaire tp10 = new TypePartenaire("Traiteur","image1");
		TypePartenaire tp11 = new TypePartenaire("Jus et cocktail","image1");	
		typePartenaireRepository.save(tp1);
		typePartenaireRepository.save(tp2);
		typePartenaireRepository.save(tp3);
		typePartenaireRepository.save(tp4);
		typePartenaireRepository.save(tp5);
		typePartenaireRepository.save(tp6);
		typePartenaireRepository.save(tp7);
		typePartenaireRepository.save(tp8);
		typePartenaireRepository.save(tp9);
		typePartenaireRepository.save(tp10);
		typePartenaireRepository.save(tp11);
		Partenaire  p1 = new Partenaire("Fakher Beauty center","info@fakherbeautycentre.com","71190097","Rue de l`or","Lac 2","Tunis","1053");
		Partenaire  p2 = new Partenaire("La Maison de Joelle Tunisie","maisonjoelle@gmail.com","55771117","19 Rue Ali Ben Khalifa"," El Menzah 9","Tunis","1013");
		Partenaire  p3 = new Partenaire("Fleuriste Bardo","Fleuristebard@gmail.com","22222222","10 rue hbib broguiba"," Bardo","Tunis","2111");
		p1.setTypePartenaire(tp3);
		p2.setTypePartenaire(tp3);
		p3.setTypePartenaire(tp2);
		partenaireRepository.save(p1);
		partenaireRepository.save(p2);
		partenaireRepository.save(p3);
		
		Service s1 =new Service("Offre machta arousa w aris tp1","desc 1 1", 50,"https://picsum.photos/300/200", LocalTime.parse("00:01:00"));
		Service s2 =new Service("Offre machta arousa w omha  w aris ","desc 2 ", 75,"https://picsum.photos/300/200", LocalTime.parse("00:01:30"));
		Service s3 =new Service("Offre machta arousa kahaw ","desc 3 ", 25,"https://picsum.photos/300/200", LocalTime.parse("00:00:30"));
		Service s4 =new Service("Offre machta arousa w aris tp2","desc 1 ", 40,"https://picsum.photos/300/200", LocalTime.parse("00:01:00"));
		Service s5 =new Service("Waeda kbira","f 1 ", 10,"https://picsum.photos/300/200", LocalTime.parse("00:00:00"));


		s1.setPartenaire(p1);
		s2.setPartenaire(p1);
		s3.setPartenaire(p1);
		s4.setPartenaire(p2);
		s5.setPartenaire(p3);
		
		serviceRepository.save(s1);
		serviceRepository.save(s2);
		serviceRepository.save(s3);
		serviceRepository.save(s4);
		serviceRepository.save(s5);
	

	}
}
