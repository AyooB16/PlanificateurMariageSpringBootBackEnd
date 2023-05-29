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
		//suite partenaire:
		Partenaire  p4 = new Partenaire("Najla Violette","viollette@gmail.com","55372154","Av,Hedi Chaker ","carthage salambo","Tunis","2040");	
		Partenaire  p5 = new Partenaire("omar lartiste ","Omarartiste@gmail.com","31176186","Av,Hedi Chaker ","Bardo","Tunis","1002");
		Partenaire  p6 = new Partenaire("makeupbydido ","DidoDido@gmail.com"," 22 950 520"," jardin de Carthage  ","Carthage","Tunis","4702");
		Partenaire  p7 = new Partenaire("espace mariee amani ","AmaniMarieeo@gmail.com"," 55789410"," 70 rue  liberté   ","Manzah 6","Ariana","2103");
		Partenaire  p8 = new Partenaire("amaldhaferbeautylounge ","AmalDhafer@gmail.com"," 98745123","70 rue  liberté    ","Manzah 6","Ariana","4189");
		Partenaire  p9 = new Partenaire("Fleuriste Avenue Habib Bourguiba","FleuristeAvenueBourguiba@gmail.com","21478620"," rue habib bouroguiba"," Centre ville","Tunis","2071");
		Partenaire  p10 = new Partenaire("Ahmed Fleuriste ","AhmedFleurs@gmail.com","54781210"," 12 rue Cheikh Idriss Chérif","Bizerte centre ville ","Bizerte","3001");
		Partenaire  p11 = new Partenaire("Chez Montassar","MontaFleurs20@gmail.com","23541710"," 36 rue Solidarité","Mourouj 1 ","Ben Arous","2014");
		Partenaire  p12 = new Partenaire("My Way","MyWayEvent@gmail.com","70147892"," Avenue Hassib Ben Ammar","Lac 1","Tunis","2015");
		Partenaire  p13 = new Partenaire("Mariage PRESTIGE","PrestigeLac2@gmail.com","77148920"," Rue de la Feuille d'Érable","Lac 2","Tunis","2016");
		Partenaire  p14 = new Partenaire("EV évents and art space","EventsEv@gmail.com"," 24 114 240"," Rue 74000 ","Manar 2","Tunis","2092");
		Partenaire  p15 = new Partenaire("Photography Hamrouni","AHEMEDHamrouni@gmail.com"," 24789120"," Rue Indépendence 2440  ","Naser 2","Ariana","3041");
		Partenaire  p16 = new Partenaire("hamdi yaakoubi photography","YaakoubiHamdi@gmail.com","25 139 070"," Rue Justice 6021  ","Naser 1","Ariana","3068");
		Partenaire  p17 = new Partenaire("mohamed afli photography","MohamedMohamed50@gmail.com"," 54271378"," Rue 14 janvier   ","Cité Ghazella","Ariana","4785");
		Partenaire  p18 = new Partenaire("invitationsmariagetn","InvitationsWeeding@gmail.com","  50 322 801"," Rue 17 Décembre   ","Manar 2","Tunis","2489");
		Partenaire  p19 = new Partenaire("si wedding invitation","wedding24@gmail.com"," 20147890"," Rue Frahat Hachad   ","Cité Olympique","Ariana","2020");
		Partenaire  p20 = new Partenaire("oui invitations","DesignInvitations@gmail.com"," 22530698"," Rue Taib mhiri   ","Cité mileha","Ariana","9021");
		Partenaire  p21 = new Partenaire("dpattaya_location","LocationVoitures@gmail.com"," 56931798"," Rue entreprenariat    ","Charguia 2","Ariana","1463");
		Partenaire  p22 = new Partenaire("Tunisia Rent Car","reservationtunisia-rent-car@gmail.com","  50 222 151"," Aéroport Tunis Carthage  ","tunis","Tunis","0147");
		Partenaire  p23 = new Partenaire("Team Car"," infocar@gmail.com" ,"  72 265 448 "," Rue de Nevers 8050    "," Hammamet","Nabeul","6523");
		Partenaire  p24 = new Partenaire("DarelFarha"," Darfarha@gmail.com","50222615 "," Rue Jamel abed Naser "," Dar chaabane","Nabeul","4102");
		Partenaire  p25 = new Partenaire("bloomy days"," bloomydays@gmail.com","56554715 "," rue ibn jazzar"," Manouba centre","Manouba","4178");
		Partenaire  p26 = new Partenaire("Dragés d'amour"," dargésamour70@gmail.com"," 26894150 "," Rue saada 7040    "," Marsa ville","La Marsa","4140");
		Partenaire  p27 = new Partenaire("baia_inspiring_spa"," baiaspa@gmail.com"," 44111222 "," Résidence Iceberg rue de la feuille d'érable    "," Lac 2","Tunis","6014");
		Partenaire  p28 = new Partenaire("Hamem E Chikh","HamemChikh@gmail.com"," 51478920 "," Rue Liberté 7050   "," cité el Habib","Gammarth","6078");
		Partenaire  p29 = new Partenaire("Fleur de Lys"," fetenfleurdelys@gmail.com","71 723 947 "," Av.Maouia IbnAbi Sofiène"," Menzah8 ","Ariana","2002");
		Partenaire  p30 = new Partenaire("Omar Hachicha"," ByOmar@gmail.com","29 150 787 "," 45 Av. Habib Bourguiba"," Zahra ","Ben Arous","2346");
		Partenaire  p31 = new Partenaire("Madame Hachicha"," mmehachicha@gmail.com","29 606 060 "," 10، Riadh Andalous"," cité Andalous ","Ariana","2974");
		Partenaire  p32 = new Partenaire("Takacim"," takacim@gmail.com","29 150 787 ","Imm.L’Express MG 1 33181 "," Centre urbain nord  ","Ariana","2002");
		Partenaire  p33 = new Partenaire("Malibu"," malibu@gmail.com"," 27 221 188 "," Avenue 14 janvier -sidi Bou Said "," Sidi Bou Saïd ","Tunis","2026");
		Partenaire  p34 = new Partenaire("Dar Belhadj"," Darbelhaj@gmail.com"," 71200894 "," Rue du Tamis  "," Tunis ","Tunis","0126");
		Partenaire  p35 = new Partenaire("Cote de jardin","cotejardin@gmail.com"," 24789300 "," Avenue Chikh zaid  "," Lac 2 ","Tunis","3048");
		Partenaire  p36 = new Partenaire("Bariolo","briolojus@gmail.com","  25 175 217 ","  Centre commercial Tunisia Mall 1   "," Lac 2 ","Tunis","0147");
		Partenaire  p37 = new Partenaire("Ener’jus","enerjus@gmail.com"," 23 036 333 "," avenue Habib Bourghiba "," Kram ","Tunis","2020");
		Partenaire  p38 = new Partenaire("Khayrat Sabaa :","khayratsabaagmail.com"," 20478926 ","Avenue Habib Bourguiba,  ","  Sidi Bou Saïd ","Tunis","3048");


		
		
		
		
		p1.setTypePartenaire(tp3);
		p2.setTypePartenaire(tp3);
		p3.setTypePartenaire(tp2);
		p4.setTypePartenaire(tp3);
		p5.setTypePartenaire(tp3);
		p6.setTypePartenaire(tp3);
		p7.setTypePartenaire(tp3);
		p8.setTypePartenaire(tp3);
		p9.setTypePartenaire(tp2);
		p10.setTypePartenaire(tp2);
		p11.setTypePartenaire(tp2);
		p12.setTypePartenaire(tp1);
		p13.setTypePartenaire(tp1);
		p14.setTypePartenaire(tp1);
		p15.setTypePartenaire(tp4);
		p16.setTypePartenaire(tp4);
		p17.setTypePartenaire(tp4);
		p18.setTypePartenaire(tp5);
		p19.setTypePartenaire(tp5);
		p20.setTypePartenaire(tp5);
		p21.setTypePartenaire(tp6);
		p22.setTypePartenaire(tp6);
		p23.setTypePartenaire(tp6);
		p24.setTypePartenaire(tp7);
		p25.setTypePartenaire(tp7);
		p26.setTypePartenaire(tp7);
		p27.setTypePartenaire(tp8);
		p28.setTypePartenaire(tp8);
		p29.setTypePartenaire(tp8);
		p30.setTypePartenaire(tp9);
		p31.setTypePartenaire(tp9);
		p32.setTypePartenaire(tp9);
		p33.setTypePartenaire(tp10);
		p34.setTypePartenaire(tp10);
		p35.setTypePartenaire(tp10);
		p36.setTypePartenaire(tp11);
		p37.setTypePartenaire(tp11);
		p38.setTypePartenaire(tp11);
		
		

		partenaireRepository.save(p1);
		partenaireRepository.save(p2);
		partenaireRepository.save(p3);
		partenaireRepository.save(p4);
		partenaireRepository.save(p5);
		partenaireRepository.save(p6);
		partenaireRepository.save(p7);
		partenaireRepository.save(p8);
		partenaireRepository.save(p9);
		partenaireRepository.save(p10);
		partenaireRepository.save(p11);
		partenaireRepository.save(p12);
		partenaireRepository.save(p13);
		partenaireRepository.save(p14);
		partenaireRepository.save(p15);
		partenaireRepository.save(p16);
		partenaireRepository.save(p17);
		partenaireRepository.save(p18);
		partenaireRepository.save(p19);
		partenaireRepository.save(p20);
		partenaireRepository.save(p21);
		partenaireRepository.save(p22);
		partenaireRepository.save(p23);
		partenaireRepository.save(p24);
		partenaireRepository.save(p25);
		partenaireRepository.save(p26);
		partenaireRepository.save(p27);
		partenaireRepository.save(p28);
		partenaireRepository.save(p29);
		partenaireRepository.save(p30);
		partenaireRepository.save(p31);
		partenaireRepository.save(p32);
		partenaireRepository.save(p33);
		partenaireRepository.save(p34);
		partenaireRepository.save(p35);
		partenaireRepository.save(p36);
		partenaireRepository.save(p37);
		partenaireRepository.save(p38);

	//	Service s1 =new Service("Offre machta arousa w aris tp1","desc 1 1", 50,"https://picsum.photos/300/200", LocalTime.parse("00:01:00"));
	//	Service s2 =new Service("Offre machta arousa w omha  w aris ","desc 2 ", 75,"https://picsum.photos/300/200", LocalTime.parse("00:01:30"));
	//	Service s3 =new Service("Offre machta arousa kahaw ","desc 3 ", 25,"https://picsum.photos/300/200", LocalTime.parse("00:00:30"));
		//Service s4 =new Service("Offre machta arousa w aris tp2","desc 1 ", 40,"https://picsum.photos/300/200", LocalTime.parse("00:01:00"));
		Service s4 =new Service("Bouquet de fleurs rouge grand","Fleurs rouge présentables ", 75,"./assets/img5.jpg", LocalTime.parse("00:00:00"));
		Service s5 =new Service("Bouquet de fleurs rouge petit","Fleurs rouge présentables ", 25,"./assets/img5.jpg", LocalTime.parse("00:00:00"));

		Service s6 =new Service("offre brushing","offre spéciale brushing pour les mariées ne ratez pas cette occasion!", 90,"./assets/img1.jpg", LocalTime.parse("02:00:00"));
		Service s7 =new Service("Offre Maquillage","Profitez avec un look makeup complet gratuit pour le 3eme personne ", 100,"./assets/img2.jpg", LocalTime.parse("02:30:00"));
		Service s8 =new Service("Vernis permanent","promo vernis permanent avec gel et capsule ", 30,"./assets/img3.jpg", LocalTime.parse("00:30:00"));
		Service s9 =new Service("Bouquet de fleurs spéciales","Fleurs variés avec une odeur originale ", 40,"./assets/img4.jpg", LocalTime.parse("00:00:00"));
		Service s10 =new Service("Bouquet de fleurs rouge","Fleurs rouge présentables ", 50,"./assets/img5.jpg", LocalTime.parse("00:00:00"));
		Service s11 =new Service("La chambre de la mariée, Salle VIP"," un complexe événementiel, composé de plusieurs espaces ouverts et clos, situé dans le cadre moderne ", 5000,"./assets/img6.jpg", LocalTime.parse("04:00:00"));
		Service s12 =new Service("La chambre de la mariée, Salle VIP,un espace en plein air","  l’équipe de MARIAGE PRESTIGE s’engage à vous faire vivre un mariage unique et intense organisé avec beaucoup de classe et de professionnalisme  ", 6000,"./assets/img7.jpg", LocalTime.parse("04:00:00"));
		Service s13 =new Service("Photos haute qualité "," photos durant toute la soirée pour tous les invités ", 600,"./assets/img8.jpg", LocalTime.parse("04:00:00"));
		Service s14 =new Service("Photos haute qualité "," photos durant toute la soirée seulement pour les mariés ", 400,"./assets/img9.jpg", LocalTime.parse("04:00:00"));
		Service s15 =new Service("300 invitations "," avec un design présentable ", 500,"./assets/img10.jpg", LocalTime.parse("02:00:00"));
		Service s16 =new Service("Limousine "," bien décorée disponible durant toute la soirée  ", 3000,"./assets/img11.jpg", LocalTime.parse("04:00:00"));
		Service s17 =new Service("BMW "," bien décorée disponible juste pour l'arrivage des mariés  ", 2000,"./assets/img12.jpg", LocalTime.parse("01:00:00"));
		Service s18=new Service("200 pièces de dragés "," bien décorée   ", 200,"./assets/img13.jpg", LocalTime.parse("02:00:00"));
		Service s19=new Service("SAUNA "," Avec un massage relaxant   ", 300,"./assets/img14.jpg", LocalTime.parse("02:00:00"));
		Service s20=new Service("Pièce montée "," gout chocolat blanc   ", 300,"./assets/img15.jpeg", LocalTime.parse("02:00:00"));
		Service s21=new Service("Pièce montée "," gout fraise  ", 250,"./assets/img16.jpg", LocalTime.parse("02:00:00"));
		Service s22=new Service("300 plats "," 300 plats riz avec des salades variés  ", 900,"./assets/img17.jpg", LocalTime.parse("03:00:00"));
		Service s23=new Service("300 plats "," 300 plats couscous avec des salades variés  ", 850,"./assets/img18.jpg", LocalTime.parse("03:00:00"));
		Service s24=new Service("400 vers de jus  "," fruits variés fraises,citron,kiwi banane  ", 750,"./assets/img19.jpg", LocalTime.parse("03:00:00"));
		Service s25=new Service("300 vers de jus  "," fruits variés fraises banane,citron menthe,orange  ", 600,"./assets/img19.jpg", LocalTime.parse("03:00:00"));



		//s1.setPartenaire(p1);
	//	s2.setPartenaire(p1);
	//	s3.setPartenaire(p1);
		s4.setPartenaire(p10);
		s5.setPartenaire(p10);
		s6.setPartenaire(p4);
		s7.setPartenaire(p5);
		s8.setPartenaire(p6);
		s9.setPartenaire(p9);
		s10.setPartenaire(p10);
		s11.setPartenaire(p12);
		s12.setPartenaire(p13);
		s13.setPartenaire(p16);
		s14.setPartenaire(p15);
		s15.setPartenaire(p19);
		s16.setPartenaire(p23);
		s17.setPartenaire(p22);
		s18.setPartenaire(p26);
		s19.setPartenaire(p27);
		s20.setPartenaire(p30);
		s21.setPartenaire(p32);
		s22.setPartenaire(p33);
		s23.setPartenaire(p34);
		s24.setPartenaire(p36);
		s25.setPartenaire(p37);


		
	//	serviceRepository.save(s1);
	//	serviceRepository.save(s2);
	//	serviceRepository.save(s3);
		serviceRepository.save(s4);
		serviceRepository.save(s5);
		serviceRepository.save(s6);
		serviceRepository.save(s7);
		serviceRepository.save(s8);
		serviceRepository.save(s9);
		serviceRepository.save(s10);
		serviceRepository.save(s12);
		serviceRepository.save(s13);
		serviceRepository.save(s14);
		serviceRepository.save(s15);
		serviceRepository.save(s16);
		serviceRepository.save(s17);
		serviceRepository.save(s18);
		serviceRepository.save(s19);
		serviceRepository.save(s20);
		serviceRepository.save(s21);
		serviceRepository.save(s22);
		serviceRepository.save(s23);
		serviceRepository.save(s24);

		serviceRepository.save(s25);





	

	}
}
