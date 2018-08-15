package com.entities.conversations;

import com.entities.personnes.Personnes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Conversations implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idConversation;
	//@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@ManyToOne
    @JoinColumn(name = "idPersonne1", referencedColumnName="idPersonne")
	private Personnes personnes1;
	@ManyToOne
    @JoinColumn(name = "idPersonne2", referencedColumnName="idPersonne")
	private Personnes personnes2;
	public Conversations() {
		super();
	}
	
	public Conversations(long idConversation) {
		super();
		this.idConversation = idConversation;
	}
	
	public Conversations(Date dateCreation, Personnes personnes1, Personnes personnes2) {
		super();
		this.dateCreation = dateCreation;
		this.personnes1 = personnes1;
		this.personnes2 = personnes2;
	}
	public long getIdConversation() {
		return idConversation;
	}
	public void setIdConversation(long idConversation) {
		this.idConversation = idConversation;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Personnes getPersonnes1() {
		return personnes1;
	}
	public void setPersonnes1(Personnes personnes1) {
		this.personnes1 = personnes1;
	}
	public Personnes getPersonnes2() {
		return personnes2;
	}
	public void setPersonnes2(Personnes personnes2) {
		this.personnes2 = personnes2;
	}
	
	

}
