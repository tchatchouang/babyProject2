package com.controller;

import com.dao.ConversationsDao;
import com.entities.conversations.Conversations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig
public class ConversationsRestServices {
	
	@Autowired
	private ConversationsDao conversationsDao;
	
	@RequestMapping(value="/conversations", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
	public List<Conversations> getPersonnes(){
		return conversationsDao.findAll();
	}
	
	@RequestMapping(value="/conversations/listParPersonne", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
	public List<Conversations> listIdTrajet(@RequestParam(name="idPersonne", defaultValue="")String idPersonne){
		return conversationsDao.listConversations(Long.parseLong(idPersonne));
	}
}
