package com.entities.personnes;

import com.entities.colisReceptionner.ColisReceptionner;
import com.entities.colisTransporter.ColisTransporter;
import com.entities.proposerColis.ProposerColis;
import com.entities.proposerTrajet.ProposerTrajet;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@JsonIgnoreProperties({"proposerColis"})
//@Inheritance(strategy=InheritanceType.JOINED) // le type d heritage= une table pour toutes les donne
//@DiscriminatorColumn(name="TYPE_PERSONNE")// alors etant donner ke sa va cree une table il faut cree un champs simgle table pour specifier le type de compte
public  class Personnes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/* declaration des variables */
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPersonne;
	private String nomPersonne;
	private String prenomPersonn;
		@Temporal(TemporalType.DATE)
	private Date dateNaissancePersonne;
	private String adresseCompletePersonne;
	@Lob  // text
	private String photoPersonne;
	private long numeroTelephonePersonne;
	private String emailPersonne;
	private String statusPersonne;
	private String paysPersonne;
	private String loginPersonne;
	private String passwordPersonne;
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.personnes", cascade = CascadeType.ALL)
	private Set<ColisReceptionner> colisReceptionners = new HashSet<ColisReceptionner>();
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.personnes", cascade = CascadeType.ALL)
	private Set<ProposerColis> proposerColis = new HashSet<ProposerColis>();

	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.personnes", cascade = CascadeType.ALL)
	private Set<ColisTransporter> colisTransporter = new HashSet<ColisTransporter>();
	
	//@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.personnes", cascade = CascadeType.ALL)
    	private Set<ProposerTrajet> proposerTrajet = new HashSet<ProposerTrajet>();
	
	public Personnes() {
		super();
	}
	
	public Personnes(Long idPersonne) {
		super();
		this.idPersonne = idPersonne;
	}

	public Personnes(String nomPersonne, String prenomPersonn, Date dateNaissancePersonne,
			String adresseCompletePersonne, String photoPersonne, long numeroTelephonePersonne, String emailPersonne,
			String statusPersonne, String paysPersonne,String loginPersonne,String passwordPersonne) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomPersonn = prenomPersonn;
		this.dateNaissancePersonne = dateNaissancePersonne;
		this.adresseCompletePersonne = adresseCompletePersonne;
		this.photoPersonne = photoPersonne;
		this.numeroTelephonePersonne = numeroTelephonePersonne;
		this.emailPersonne = emailPersonne;
		this.statusPersonne = statusPersonne;
		this.paysPersonne = paysPersonne;
		this.loginPersonne = loginPersonne;
		this.passwordPersonne=passwordPersonne;

	}
	
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomPersonn() {
		return prenomPersonn;
	}
	public void setPrenomPersonn(String prenomPersonn) {
		this.prenomPersonn = prenomPersonn;
	}
	public Date getDateNaissancePersonne() {
		return dateNaissancePersonne;
	}
	public void setDateNaissancePersonne(Date dateNaissancePersonne) {
		this.dateNaissancePersonne = dateNaissancePersonne;
	}
	public String getAdresseCompletePersonne() {
		return adresseCompletePersonne;
	}
	public void setAdresseCompletePersonne(String adresseCompletePersonne) {
		this.adresseCompletePersonne = adresseCompletePersonne;
	}
	public String getPhotoPersonne() {
		return photoPersonne;
	}
	public void setPhotoPersonne(String photoPersonne) {
		this.photoPersonne = photoPersonne;
	}
	public long getNumeroTelephonePersonne() {
		return numeroTelephonePersonne;
	}
	public void setNumeroTelephonePersonne(long numeroTelephonePersonne) {
		this.numeroTelephonePersonne = numeroTelephonePersonne;
	}
	public String getEmailPersonne() {
		return emailPersonne;
	}
	public void setEmailPersonne(String emailPersonne) {
		this.emailPersonne = emailPersonne;
	}
	public String getStatusPersonne() {
		return statusPersonne;
	}
	public void setStatusPersonne(String statusPersonne) {
		this.statusPersonne = statusPersonne;
	}
	public String getPaysPersonne() {
		return paysPersonne;
	}
	public void setPaysPersonne(String paysPersonne) {
		this.paysPersonne = paysPersonne;
	}
	public String getLoginPersonne() {
		return loginPersonne;
	}
	public void setLoginPersonne(String loginPersonne) {
		this.loginPersonne = loginPersonne;
	}
	public String getPasswordPersonne() {
		return passwordPersonne;
	}
	public void setPasswordPersonne(String passwordPersonne) {
		this.passwordPersonne = passwordPersonne;
	}
	
	public Set<ColisReceptionner> getColisReceptionners() {
		return colisReceptionners;
	}
	public void setColisReceptionners(Set<ColisReceptionner> colisReceptionners) {
		this.colisReceptionners = colisReceptionners;
	}
	public Set<ProposerColis> getProposerColis() {
		return proposerColis;
	}
	public void setProposerColis(Set<ProposerColis> proposerColis) {
		this.proposerColis = proposerColis;
	}
	public Set<ColisTransporter> getColisTransporter() {
		return colisTransporter;
	}
	public void setColisTransporter(Set<ColisTransporter> colisTransporter) {
		this.colisTransporter = colisTransporter;
	}	
	
	public Set<ProposerTrajet> getProposerTrajet() {
		return proposerTrajet;
	}
	public void setProposerTrajet(Set<ProposerTrajet> proposerTrajet) {
		this.proposerTrajet = proposerTrajet;
	}
	
	public void addProposerTrajet(ProposerTrajet pt) {
		this.proposerTrajet.add(pt);
	}
	
}
