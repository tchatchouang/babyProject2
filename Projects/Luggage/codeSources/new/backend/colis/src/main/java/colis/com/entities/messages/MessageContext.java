package com.entities.messages;

import java.util.Date;

public class MessageContext {
	
	private String cotenueMessage;
	private String etatMessage;
	private Date date;
	private long idConversation;
	private long idPersonne;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getIdConversation() {
		return idConversation;
	}
	public void setIdConversation(long idConversation) {
		this.idConversation = idConversation;
	}
	public long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}
	
}
