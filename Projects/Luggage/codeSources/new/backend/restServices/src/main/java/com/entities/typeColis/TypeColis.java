package com.entities.typeColis;

import com.entities.colis.Colis;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TypeColis implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTypeColis;
	private String libelleTypeColis;
	
	@ManyToOne
    @JoinColumn(name = "idColis", referencedColumnName="idColis")
	private Colis colis;
	
	public TypeColis(long idTypeColis, String libelleTypeColis) {
		super();
		this.idTypeColis = idTypeColis;
		this.libelleTypeColis = libelleTypeColis;
	}
	@Override
	public String toString() {
		return "TypeColis []";
	}
	public long getIdTypeColis() {
		return idTypeColis;
	}
	public void setIdTypeColis(long idTypeColis) {
		this.idTypeColis = idTypeColis;
	}
	public String getLibelleTypeColis() {
		return libelleTypeColis;
	}
	public void setLibelleTypeColis(String libelleTypeColis) {
		this.libelleTypeColis = libelleTypeColis;
	}
	
}
