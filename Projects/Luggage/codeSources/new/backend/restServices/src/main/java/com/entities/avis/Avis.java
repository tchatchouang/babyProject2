package com.entities.avis;

import com.entities.personnes.Personnes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Avis implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAvis;
	private String libelleAvis;
	private String valeurAvis;
	@ManyToOne
    @JoinColumn(name = "idPersonne", referencedColumnName="idPersonne")
	private Personnes personnes;
	public Avis() {
		super();
	}
	public Avis(long idAvis, String libelleAvis, String valeurAvis) {
		super();
		this.idAvis = idAvis;
		this.libelleAvis = libelleAvis;
		this.valeurAvis = valeurAvis;
	}
	public long getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(long idAvis) {
		this.idAvis = idAvis;
	}
	public String getLibelleAvis() {
		return libelleAvis;
	}
	public void setLibelleAvis(String libelleAvis) {
		this.libelleAvis = libelleAvis;
	}
	public String getValeurAvis() {
		return valeurAvis;
	}
	public void setValeurAvis(String valeurAvis) {
		this.valeurAvis = valeurAvis;
	}
	public Personnes getPersonnes() {
		return personnes;
	}
	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}
	
}
