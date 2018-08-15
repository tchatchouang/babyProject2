package com.entities.colis;

import com.entities.colisReceptionner.ColisReceptionner;
import com.entities.colisTransporter.ColisTransporter;
import com.entities.proposerColis.ProposerColis;
import com.entities.typeColis.TypeColis;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Colis implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//variables
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idColis;
	private String libelleColis;
	private double poidColis;
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.colis", cascade = CascadeType.ALL)
	private Set<ColisReceptionner> colisReceptionner = new HashSet<ColisReceptionner>();
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.colis", cascade = CascadeType.ALL)
	private Set<ProposerColis> proposerColis = new HashSet<ProposerColis>();
	
	@JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.colis", cascade = CascadeType.ALL)
	private Set<ColisTransporter> colisTransporter = new HashSet<ColisTransporter>();
	
	
	
	public Colis() {
		super();
	}
	
	public Colis(String libelleColis, double poidColis, Set<ColisReceptionner> colisReceptionner,
			Set<ProposerColis> proposerColis, Set<ColisTransporter> colisTransporter, TypeColis typeColis) {
		super();
		this.libelleColis = libelleColis;
		this.poidColis = poidColis;
		this.colisReceptionner = new HashSet<>();
		this.proposerColis = new HashSet<>();
		this.colisTransporter = new HashSet<>();
	}

	public Long getIdColis() {
		return idColis;
	}
	public void setIdColis(Long idColis) {
		this.idColis = idColis;
	}
	public String getLibelleColis() {
		return libelleColis;
	}
	public void setLibelleColis(String libelleColis) {
		this.libelleColis = libelleColis;
	}
	public double getTaille() {
		return poidColis;
	}
	public void setTaille(double poidColis) {
		this.poidColis = poidColis;
	}
	
}
