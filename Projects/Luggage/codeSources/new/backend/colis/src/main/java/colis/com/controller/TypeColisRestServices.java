package com.controller;

import com.dao.TypeColisDao;
import com.entities.typeColis.TypeColis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
// @CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig

public class TypeColisRestServices {
	
	@Autowired // injection des depenses
	private TypeColisDao typeColisDao;

			@RequestMapping(value="/colis/typeColis", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
			public TypeColis saveColisType(@RequestBody TypeColis tc){
				return typeColisDao.save(tc);
			}
}
