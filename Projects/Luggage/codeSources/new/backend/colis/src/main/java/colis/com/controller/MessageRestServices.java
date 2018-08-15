package com.controller;

import com.dao.ConversationsDao;
import com.dao.MessageDao;
import com.dao.personnesDao;
import com.entities.conversations.Conversations;
import com.entities.messages.Message;
import com.entities.messages.MessageContext;
import com.entities.messages.MessageEnvoyer;
import com.entities.messages.MessageRecu;
import com.entities.personnes.Personnes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
// @CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig

public class MessageRestServices {
	@Autowired  
	private MessageDao messageDao;
	private ConversationsDao conversationsDao;
	private personnesDao personnesdao;
	
	/*@RequestMapping(value="/messages", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
	public Message saveMessage(@RequestBody Message m){
		return messageDao.save(m);
	}
	@RequestMapping(value="/messageRecu", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
	public Message listMessageRecu(@RequestParam(name="idPersonne", defaultValue="")String idPersonne){
		return  messageDao.findOne(Long.parseLong(idPersonne));
	}*/
	
	@RequestMapping(value="/messages/listMessageFromConver", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
	public List<Message> listMessageFromConversation(@RequestParam(name="idConversation", defaultValue="")String idConversation){
		return messageDao.listMessageFromConversation(Long.parseLong(idConversation));
	}
	
	@RequestMapping(value="/messages/saveMessageSend", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
	public Message saveMessageEnvoyer(@RequestBody MessageContext mc) throws ParseException{
		Date aujourdhui = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.format(aujourdhui);
		String string = dateFormat.format(aujourdhui);//"January 2, 2010";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.FRENCH);
		Date date = format.parse(string);
		
		System.out.println("idc " + mc.getIdConversation());
		System.out.println("idc " + mc.getIdPersonne());
		System.out.println("idc " + mc.getDate());
		System.out.println("idc " + mc.getCotenueMessage());
		System.out.println("date  " + date);
		Conversations c = new Conversations(mc.getIdConversation());//.findOne(mc.getIdConversation());
		Personnes p = new Personnes(mc.getIdPersonne()); //personnesdao.findOne(mc.getIdPersonne());
		Message ms = new MessageEnvoyer(mc.getCotenueMessage(), "", date ,c, p);		
		return messageDao.save(ms);
	}
	
	@RequestMapping(value="/messages/saveMessageRecu", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
	public Message saveMessageRecu(@RequestBody MessageContext mc){
		Conversations c = new Conversations(mc.getIdConversation());//.findOne(mc.getIdConversation());
		Personnes p = new Personnes(mc.getIdPersonne()); //personnesdao.findOne(mc.getIdPersonne());
		Message mr = new MessageRecu(mc.getCotenueMessage(), "", new Date(),c, p);		
		return messageDao.save(mr);
	}
}
