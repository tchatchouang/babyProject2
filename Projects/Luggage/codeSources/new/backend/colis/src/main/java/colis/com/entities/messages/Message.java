package com.entities.messages;

import com.entities.conversations.Conversations;
import com.entities.personnes.Personnes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.JOINED) // le type d heritage= une table pour toutes les donne
@DiscriminatorColumn(name="typeMess")// alors etant donner ke sa va cree une table il faut cree un champs simgle table pour specifier le type de compte
public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idMessage;
	//private String objetMessage;
	private String cotenueMessage;
	private String etatMessage;
	//private String typeMessage;
	private Date dateMessage;
	@ManyToOne
    @JoinColumn(name = "idConversation", referencedColumnName="idConversation")
	private Conversations conversations;
	
	@ManyToOne
    @JoinColumn(name = "idPersonne", referencedColumnName="idPersonne")
	private Personnes personnes;
	
	public Message() {
		super();
	}

	/*
	public Message(String cotenueMessage, String etatMessage, String typeMessage, Conversations conversations,
			Personnes personnes) {
		super();
		this.cotenueMessage = cotenueMessage;
		this.etatMessage = etatMessage;
		//this.typeMessage = typeMessage;
		this.conversations = conversations;
		this.personnes = personnes;
	}*/


	public Message(String cotenueMessage, String etatMessage, Date dateMessage,Conversations conversations, Personnes personnes) {
		super();
		this.cotenueMessage = cotenueMessage;
		this.etatMessage = etatMessage;
		this.conversations = conversations;
		this.personnes = personnes;
		this.dateMessage = dateMessage;
	}


	public long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(long idMessage) {
		this.idMessage = idMessage;
	}

	public String getCotenueMessage() {
		return cotenueMessage;
	}

	public void setCotenueMessage(String cotenueMessage) {
		this.cotenueMessage = cotenueMessage;
	}

	public String getEtatMessage() {
		return etatMessage;
	}

	public void setEtatMessage(String etatMessage) {
		this.etatMessage = etatMessage;
	}

	public Conversations getConversations() {
		return conversations;
	}

	public void setConversations(Conversations conversations) {
		this.conversations = conversations;
	}

	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}

	public Date getDateMessage() {
		return dateMessage;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}


	/*public String getTypeMessage() {
		return typeMessage;
	}


	public void setTypeMessage(String typeMessage) {
		this.typeMessage = typeMessage;
	}*/



	
}
