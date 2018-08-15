package com.controller;

import com.dao.TrajetDao;
import com.dao.personnesDao;
import com.entities.colisTransporter.ColisTransporterContext;
import com.entities.personnes.Personnes;
import com.entities.proposerTrajet.ProposerTrajet;
import com.entities.proposerTrajet.ProposerTrajetContext;
import com.entities.trajets.Trajet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

// @CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true" )
@RestController
// @CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig
public class PersonneRestServives {
    @Autowired // injection des depenses
    private personnesDao personnesdao;


    @Autowired
    private TrajetDao trajetDao;

    // liste des personne
    @RequestMapping(value = "/personnes", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public List<Personnes> getPersonnes() {
        return personnesdao.findAll();
    }

    // consulter uune personne
    @RequestMapping(value = "/personnes/{idPersonne}", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public Personnes getConPersonnes(@PathVariable Long idPersonne) {
        Optional<Personnes> optionalPersonnes = this.personnesdao.findById(idPersonne);
        if (optionalPersonnes.isPresent()) {
            return optionalPersonnes.get();
        } else {
            return null;
        }
        //return personnesdao.findOne(idPersonne);
    }

    @RequestMapping(value = "/personnes/checkLoginPass", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public Personnes searchLoginAndPasswordPersonne(
            @RequestParam(name = "loginPersonne", defaultValue = "") String loginPersonne,
            @RequestParam(name = "passwordPersonne", defaultValue = "") String passwordPersonne) {
        System.out.println("login : " + loginPersonne);
        System.out.println("pword: " + passwordPersonne);
        return personnesdao.findLoginPassPers(loginPersonne, passwordPersonne);
    }

    // chercher des personne
    @RequestMapping(value = "/personnes/search", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public Page<Personnes> searchPersonne(
            @RequestParam(name = "pers", defaultValue = "") String pers,
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "2") int size) {
        System.out.println("pers : " + pers);
        System.out.println("page : " + page);
        System.out.println("size : " + size);
        return personnesdao.search("%" + pers + "%", new PageRequest(page, size));
    }

    // ajouter uune personne
    @RequestMapping(value = "/personnes", method = RequestMethod.POST)
// elle nous permet d'avoir le resultat de cette requet par http
    public Personnes save(@RequestBody Personnes p) {
        return personnesdao.save(p);
    }

    // supprimer uune personne
    @RequestMapping(value = "/personnes/{idPersonne}", method = RequestMethod.DELETE)
// elle nous permet d'avoir le resultat de cette requet par http
    public boolean delete(@PathVariable Long idPersonne) {
        // TODO delete ne prend plus un Id mais un object
        // personnesdao.delete(idPersonne);
        return true;
    }

    // update uune personne
    @RequestMapping(value = "/personnes/{idPersonne}", method = RequestMethod.PUT)
// elle nous permet d'avoir le resultat de cette requet par http
    public Personnes update(@PathVariable Long idPersonne, @RequestBody Personnes p) {
        p.setIdPersonne(idPersonne);
        return personnesdao.save(p);
    }

    /***************************************  TRAJET  PROPOSER******************************/
    @RequestMapping(value = "/personnes/saveTrajetProposer", method = RequestMethod.POST)
// elle nous permet d'avoir le resultat de cette requet par http
    public void saveTrajetProposer(@RequestBody ProposerTrajetContext personnesContext) {

        System.out.println("idpersonne : " + personnesContext.getPersonnes().getIdPersonne());
        System.out.println("idtrajet : " + personnesContext.getTrajet().getIdTrajet());
        System.out.println("poids : " + personnesContext.getPoidColis());

       // Personnes personnes = personnesdao.findOne(personnesContext.getPersonnes().getIdPersonne());
        Personnes personnes = new Personnes();
        Optional<Personnes> optionalPersonnes = this.personnesdao.findById(personnesContext.getPersonnes().getIdPersonne());
        if (optionalPersonnes.isPresent()) {
            personnes =  optionalPersonnes.get();
        }

        Set<ProposerTrajet> trajetProposerSet = new HashSet<ProposerTrajet>();
        ProposerTrajet trajetProposer = new ProposerTrajet();
        trajetProposer.setPersonnes(personnes);
        trajetProposer.setTrajet(personnesContext.getTrajet());
        trajetProposer.setDatePropositionTrajet(new Date());
        trajetProposer.setNombreVisite(0);
        trajetProposer.setPoidColis(personnesContext.getPoidColis());
        personnesContext.getTrajet().getProposerTrajet().add(trajetProposer);
        trajetProposerSet.add(trajetProposer);
        personnes.addProposerTrajet(trajetProposer);
        personnesdao.save(personnes);
    }

    @RequestMapping(value = "/personnes/TrajetProposer/find", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public List<ProposerTrajet> searchTrajetProposer(@RequestParam(name = "idPersonne", defaultValue = "") String idPersonne) {
        //List<Trajet> listTrajet = new ArrayList<Trajet>();
        //listTrajet = personnesdao.listTrajets(Long.parseLong(idPersonne));
        //System.out.println("listTrajet : "+listTrajet.get(0).getLibelleTrajet());
        return personnesdao.findProposerTrajetByPersonnes(Long.parseLong(idPersonne));
    }

    @RequestMapping(value = "/personnes/Trajet/list", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public List<Trajet> listIdTrajet(@RequestParam(name = "idPersonne", defaultValue = "") String idPersonne) {
        return personnesdao.listTrajets(Long.parseLong(idPersonne));
    }

    /*@RequestMapping(value="/alltrajetproposer", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
    public Page<Trajet> listTrajetPrpposerTrajet(
            @RequestParam(name="lieuDep", defaultValue="") String lieuDep,
            @RequestParam(name="lieuArr", defaultValue="") String lieuArr,
            @RequestParam(name="page", defaultValue="0") int page,
            @RequestParam(name="size", defaultValue="3") int size){
        return personnesdao.listTrajetPrpposerTrajet("%"+lieuDep+"%","%"+lieuArr+"%", new PageRequest(page, size));
    }*/
    @RequestMapping(value = "/dosearche", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public Page<Trajet> doSearchTrajetProposerPage(
            @RequestParam(name = "lieuDepart", defaultValue = "") String lieuDepart,
            @RequestParam(name = "lieuArriver", defaultValue = "") String lieuArriver,
			/*@RequestParam(name="dateDepart", defaultValue="") String dateDepart,
			@RequestParam(name="dateArriver", defaultValue="") String dateArriver, */
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "3") int size) {

        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        //df.parse(dateDepart);

        //Date da = formatter.parse(dateArriver); //new Date(); //
        //Date dd = formatter.parse(dateDepart);
        Date d = null;

        //System.out.println("dateArriver: " +dateDepart);
        //System.out.println("dateArriver : " +dateArriver);

        System.out.println("lieuDep : " + lieuDepart);
        System.out.println("lieuArr : " + lieuArriver);

        // System.out.println(da);
        //System.out.println(formatter.format(da));

        //return personnesdao.doSearchTrajetProposerPage("%"+lieuDepart+"%","%"+lieuArriver+"%",d,d,new PageRequest(page, size));
        return personnesdao.doSearchTrajetProposerPage("%" + lieuDepart + "%", "%" + lieuArriver + "%", new PageRequest(page, size));
    }

    @RequestMapping(value = "/alltrajetproposer", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public List<Trajet> listTrajetPrpposerTrajet() {
        return personnesdao.listTrajetPrpposerTrajet();
    }

    @RequestMapping(value = "/infoperstra", method = RequestMethod.GET)
// elle nous permet d'avoir le resultat de cette requet par http
    public Personnes listPersonneTrajetProser(@RequestParam(name = "idTrajet", defaultValue = "") String idTrajet) {
        return personnesdao.listPersonneTrajetProser(Long.parseLong(idTrajet));
    }

    /***************************************  COLIS  TRANSPORTER******************************/
    @RequestMapping(value = "/personnes/saveColisTransporter", method = RequestMethod.POST)
// elle nous permet d'avoir le resultat de cette requet par http
    public void saveColisTransporter(@RequestBody ColisTransporterContext colisTransporterContext) {
		
		/*System.out.println("idpersonne : "+colisTransporterContext.getPersonnes().getIdPersonne());  
		System.out.println("idcolis : "+colisTransporterContext.getColis().getIdColis());  
		
		Personnes personnes =  personnesdao.findOne(personnesContext.getPersonnes().getIdPersonne());
		Set<ProposerTrajet> trajetProposerSet = new HashSet<ProposerTrajet>();
		ProposerTrajet trajetProposer = new ProposerTrajet();
		trajetProposer.setPersonnes(personnes);
		trajetProposer.setTrajet(personnesContext.getTrajet());
		trajetProposer.setDatePropositionTrajet(new Date());
		trajetProposer.setNombreVisite(0);
		trajetProposer.setPoidColis(personnesContext.getPoidColis());
		personnesContext.getTrajet().getProposerTrajet().add(trajetProposer);
		trajetProposerSet.add(trajetProposer);
		personnes.addProposerTrajet(trajetProposer);
		personnesdao.save(personnes);*/
    }

}

//long id = 1;//Long.valueOf(idPersonne);
//System.out.println("pword: "+idPersonne);
//System.out.println("idtrajet : "+personnesdao.findProposerTrajetByTrajets(id));

// tous les id des trajet lier a une personne
/*List<Long> listDesIdDesTrajtePublier = new ArrayList<Long>(Arrays.asList(1l,2l));
List<Trajet> listTrajet = new ArrayList<Trajet>();
listDesIdDesTrajtePublier = personnesdao.listOfTrajets(id);
System.out.println("size: "+listDesIdDesTrajtePublier.size());

for (long i = 0; i < listDesIdDesTrajtePublier.size(); i++) {
	listTrajet.add(trajetDao.findOne(i));
}*/

//System.out.println("size trajet: "+listTrajet.size());


// consulter uune personne
//@RequestMapping(value="/personnes/checkLoginPass{loginPersonne,passwordPersonne}", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
//public Personnes searchLoginAndPasswordPersonne(@PathVariable String loginPersonne,@PathVariable String passwordPersonne){
//	return personnesdao.findLoginPassPers(loginPersonne, passwordPersonne);
//}