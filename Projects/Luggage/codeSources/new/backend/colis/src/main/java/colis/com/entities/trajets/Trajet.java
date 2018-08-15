package com.entities.trajets;

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
//@DiscriminatorColumn(name="ETAT")// alors etant donner ke sa va cree une table il faut cree un champs simgle table pour specifier le type de compte
public class Trajet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTrajet;
	private String libelleTrajet;
	private String lieuDepart;
	private String lieuArriver;
	//@Temporal(TemporalType.DATE)
	private Date dateDepart;
	//@Temporal(TemporalType.DATE)
	private Date dateArriver;
	@Lob  // text
	private String photoPaysDepart;
	@Lob  // text
	private String photoPaysArrive;
	private String paysDepart;
	private String paysArrive;
	private String visibleSurCarte;
	private String etatTrajet;
	private float latitudeDepart;
	private float longitudeDepart;
	private float latitudeArriver;
	private float longitudeArriver;
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.trajet", cascade = CascadeType.ALL)
	private Set<ProposerColis> proposerColis = new HashSet<ProposerColis>();
	
	//@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.trajet", cascade = CascadeType.ALL)
	private Set<ProposerTrajet> proposerTrajet = new HashSet<ProposerTrajet>();

	public Trajet() {
		super();
	}
	
	public Trajet(long idTrajet) {
		super();
		this.idTrajet = idTrajet;
	}

	public Trajet(String libelleTrajet, String lieuDepart, String lieuArriver, Date dateDepart, Date dateArriver,
			String visibleSurCarte, String etatTrajet, Set<ProposerColis> proposerColis,
			Set<ProposerTrajet> proposerTrajet) {
		super();
		this.libelleTrajet = libelleTrajet;
		this.lieuDepart = lieuDepart;
		this.lieuArriver = lieuArriver;
		this.dateDepart = dateDepart;
		this.dateArriver = dateArriver;
		this.visibleSurCarte = visibleSurCarte;
		this.etatTrajet = etatTrajet;
		this.proposerColis = new HashSet<>();
		this.proposerTrajet = new HashSet<>();
	}
	
	public Trajet(String libelleTrajet, String lieuDepart, String lieuArriver, Date dateDepart, Date dateArriver,
			String visibleSurCarte, String etatTrajet) {
		super();
		this.libelleTrajet = libelleTrajet;
		this.lieuDepart = lieuDepart;
		this.lieuArriver = lieuArriver;
		this.dateDepart = dateDepart;
		this.dateArriver = dateArriver;
		this.visibleSurCarte = visibleSurCarte;
		this.etatTrajet = etatTrajet;
	}

	public String getLibelleTrajet() {
		return libelleTrajet;
	}

	public void setLibelleTrajet(String libelleTrajet) {
		this.libelleTrajet = libelleTrajet;
	}

	public String getLieuDepart() {
		return lieuDepart;
	}

	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}

	public String getLieuArriver() {
		return lieuArriver;
	}

	public void setLieuArriver(String lieuArriver) {
		this.lieuArriver = lieuArriver;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArriver() {
		return dateArriver;
	}

	public void setDateArriver(Date dateArriver) {
		this.dateArriver = dateArriver;
	}

	public String isVisibleSurCarte() {
		return visibleSurCarte;
	}

	public String getEtatTrajet() {
		return etatTrajet;
	}

	public void setEtatTrajet(String etatTrajet) {
		this.etatTrajet = etatTrajet;
	}

	public Set<ProposerColis> getProposerColis() {
		return proposerColis;
	}

	public void setProposerColis(Set<ProposerColis> proposerColis) {
		this.proposerColis = proposerColis;
	}

	public Set<ProposerTrajet> getProposerTrajet() {
		return proposerTrajet;
	}

	public void setProposerTrajet(Set<ProposerTrajet> proposerTrajet) {
		this.proposerTrajet = proposerTrajet;
	}

	public long getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(long idTrajet) {
		this.idTrajet = idTrajet;
	}

	public String getPaysDepart() {
		return paysDepart;
	}

	public void setPaysDepart(String paysDepart) {
		this.paysDepart = paysDepart;
	}

	public String getPaysArrive() {
		return paysArrive;
	}

	public void setPaysArrive(String paysArrive) {
		this.paysArrive = paysArrive;
	}

	public String getPhotoPaysDepart() {
		return photoPaysDepart;
	}

	public void setPhotoPaysDepart(String photoPaysDepart) {
		this.photoPaysDepart = photoPaysDepart;
	}

	public String getPhotoPaysArrive() {
		return photoPaysArrive;
	}

	public void setPhotoPaysArrive(String photoPaysArrive) {
		this.photoPaysArrive = photoPaysArrive;
	}

	public String getVisibleSurCarte() {
		return visibleSurCarte;
	}

	public void setVisibleSurCarte(String visibleSurCarte) {
		this.visibleSurCarte = visibleSurCarte;
	}

	public float getLatitudeDepart() {
		return latitudeDepart;
	}

	public void setLatitudeDepart(float latitudeDepart) {
		this.latitudeDepart = latitudeDepart;
	}

	public float getLongitudeDepart() {
		return longitudeDepart;
	}

	public void setLongitudeDepart(float longitudeDepart) {
		this.longitudeDepart = longitudeDepart;
	}

	public float getLatitudeArriver() {
		return latitudeArriver;
	}

	public void setLatitudeArriver(float latitudeArriver) {
		this.latitudeArriver = latitudeArriver;
	}

	public float getLongitudeArriver() {
		return longitudeArriver;
	}

	public void setLongitudeArriver(float longitudeArriver) {
		this.longitudeArriver = longitudeArriver;
	}
	
	
}
