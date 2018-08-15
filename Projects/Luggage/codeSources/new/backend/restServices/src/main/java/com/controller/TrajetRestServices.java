package com.controller;


import com.dao.TrajetDao;
import com.entities.trajets.Trajet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig

public class TrajetRestServices {
	
	@Autowired // injection des depenses
	private TrajetDao trajetDao;

			@RequestMapping(value="/trajet", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
			public Trajet saveTrajet(@RequestBody Trajet t){
				return trajetDao.save(t);
			}
			@RequestMapping(value="/trajet/list", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
			public Trajet listTrajet(@RequestParam(name="idTrajet", defaultValue="")String idTrajet){
				Optional<Trajet> trajetOptional = this.trajetDao.findById(Long.parseLong(idTrajet));
				if (trajetOptional.isPresent()) {
					return trajetOptional.get();
				} else {
					return null;
				}
				//return  trajetDao.findById(Long.parseLong(idTrajet));
			}
			@RequestMapping(value="/trajet/all", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
			public List<Trajet> getPersonnes(){
				return trajetDao.findAll();
			}
}
