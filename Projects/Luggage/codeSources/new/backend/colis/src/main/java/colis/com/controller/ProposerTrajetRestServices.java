package com.controller;


import com.dao.ProposerTrajetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig
public class ProposerTrajetRestServices {
	@Autowired
	private ProposerTrajetDao proposerTrajetDao;
	
	/*@RequestMapping(value="/trajetproposers", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
	public List<ProposerTrajet> getAllTrajetProposer(){
		return proposerTrajetDao.findAll();
	}*/
}


/*@Autowired
ProposerTrajetDao proposerTrajetDao;

@RequestMapping(value="/trajetproposer", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
public List<ProposerTrajet> getProposerTrajet(){
	return proposerTrajetDao.findAll();
}*/
// consulter uune personne
/*@RequestMapping(value="/trajetproposer/{idPersonne}", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
public ProposerTrajet getIdTrajetProposer(@PathVariable Long idPersonne){
	return proposerTrajetDao.findOne(idPersonne);
}
*/
/*@RequestMapping(value="/trajetproposer/savee", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
public ProposerTrajet saveTrajetProposerr(@RequestBody ProposerTrajet trajetProposer){
	
	trajetProposer.setDatePropositionTrajet(new Date());
	trajetProposer.setNombreVisite(0);
	//trajetProposer.getPersonnes().getProposerTrajet().add(trajetProposer);
	
	/*System.out.println("poid : "+trajetProposer.getPoidColis());  //data["idTrajet"];
	System.out.println("idpersonne : "+trajetProposer.getPersonnes().getIdPersonne());  
	System.out.println("idtrajet : "+trajetProposer.getTrajet().getIdTrajet());  
	System.out.println("date : "+trajetProposer.getDatePropositionTrajet());  
	System.out.println("visite : "+trajetProposer.getNombreVisite());  
	System.out.println("trajetProposer : "+trajetProposer.toString()); 
	System.out.println(trajetProposer.getPersonnes().getProposerTrajet().size());*/


	//return proposerTrajetDao.save(trajetProposer);
//}*/

/*String[] arrayTrajetProposer = trajetProposer.split(",");
System.out.println("arrayTrajetProposer : "+arrayTrajetProposer[0]);  //data["idTrajet"];
String idPersonne = arrayTrajetProposer[0];
String[] arrayIdPersonne = idPersonne.split(":");
System.out.println("idPersonne : "+arrayIdPersonne[1]);  //data["idTrajet"];
String t= arrayIdPersonne[1];`*/
//long idPersonneA = Long.parseLong(t);
//System.out.println("idPersonne : "+Long.parseLong(arrayIdPersonne[1]) );  //data["idTrajet"];

/*Personnes personne = new Personnes();
Trajet trajet = new Trajet();

ProposerTrajet proposerTrajet = new ProposerTrajet();
proposerTrajet.setPersonnes(pt.getPersonnes());
proposerTrajet.setTrajet(pt.getTrajet());
proposerTrajet.setPoidColis(pt.getPoidColis());
proposerTrajet.setNombreVisite(200);
proposerTrajet.setDatePropositionTrajet(new Date());*/
/*
long val =1;
Personnes personne = new Personnes(val);
Trajet trajet = new Trajet(1);
ProposerTrajet proposerTrajet = new ProposerTrajet();
proposerTrajet.setPersonnes(personne);
proposerTrajet.setTrajet(trajet);
proposerTrajet.setPoidColis(pt.getPoidColis());
proposerTrajet.setNombreVisite(200);
proposerTrajet.setDatePropositionTrajet(new Date());

System.out.println("poid : "+pt.getPoidColis());
System.out.println("idTrajet  : "+personne.getIdPersonne());
System.out.println("idPersonne : "+trajet.getIdTrajet());


personne.getProposerTrajet().add(proposerTrajet);
*/
/*@RequestParam(name="idPersonne", defaultValue="")String idPersonne, 
@RequestParam(name="idTrajet", defaultValue="")String idTrajet,
@RequestParam(name="poid", defaultValue="")String poid*/
//System.out.println("idTrajet : "+pt.getTrajet().getIdTrajet());
//System.out.println("idPersonne : "+pt.getPersonnes().getIdPersonne());

/*long idPer = Long.parseLong(idPersonne);
long idTra = Long.parseLong(idTrajet);
double p = Double.parseDouble(poid);
System.out.println("poid double : "+idTra);
System.out.println("idTrajet long : "+idTra);
System.out.println("idPersonne  long: "+idPer);

Personnes personne = new Personnes(idPer);
Trajet trajet = new Trajet(idTra);
//personne.setIdPersonne(idPer);
//trajet.setIdTrajet(idTra);

System.out.println("idTrajet long id : "+personne.getIdPersonne());
System.out.println("idPersonne  long id : "+trajet.getIdTrajet());


ProposerTrajet proposerTrajet = new ProposerTrajet();
proposerTrajet.setPersonnes(personne);
proposerTrajet.setTrajet(trajet);
proposerTrajet.setPoidColis(p);
proposerTrajet.setNombreVisite(200);
proposerTrajet.setDatePropositionTrajet(new Date());


System.out.println("idTrajet long id : "+proposerTrajet.getPersonnes().getIdPersonne());
System.out.println("idPersonne  long id : "+proposerTrajet.getTrajet().getIdTrajet());
System.out.println("poind  long id : "+proposerTrajet.getPoidColis());
System.out.println("nbr  long id : "+proposerTrajet.getNombreVisite());
System.out.println("date : "+proposerTrajet.getDatePropositionTrajet());


personne.getProposerTrajet().add(proposerTrajet);*/


/*long idPer = Long.parseLong(idPersonne);
long idTra = Long.parseLong(idTrajet);
double p = Double.parseDouble(poid);
System.out.println("poid : "+poid);
System.out.println("idTrajet : "+idTrajet);
System.out.println("idPersonne : "+idPersonne);
Personnes personne = new Personnes();
Trajet trajet = new Trajet();


personne.setIdPersonne(idPer);
trajet.setIdTrajet(idTra);

ProposerTrajet proposerTrajet = new ProposerTrajet();
proposerTrajet.setPersonnes(personne);
proposerTrajet.setTrajet(trajet);
proposerTrajet.setPoidColis(p);
proposerTrajet.setNombreVisite(200);
proposerTrajet.setDatePropositionTrajet(new Date());
personne.getProposerTrajet().add(proposerTrajet);*/

/*@RequestMapping(value="/trajet/proposer", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
public void saveTrajetProposer(
		@RequestParam(name="idPersonne", defaultValue="")long idPersonne, 
		@RequestParam(name="idTrajet", defaultValue="")long idTrajet,
		@RequestParam(name="poid", defaultValue="")double poid){
	Personnes personne = new Personnes();
	Trajet trajet = new Trajet();
	
	personne.setIdPersonne(idPersonne);
	trajet.setIdTrajet(idTrajet);
	
	ProposerTrajet proposerTrajet = new ProposerTrajet();
	proposerTrajet.setPersonnes(personne);
	proposerTrajet.setTrajet(trajet);
	proposerTrajet.setPoidColis(poid);
	proposerTrajet.setNombreVisite(200);
	proposerTrajet.setDatePropositionTrajet(new Date());
	personne.getProposerTrajet().add(proposerTrajet);
	//return personnesdao.save(personne);
}*/

