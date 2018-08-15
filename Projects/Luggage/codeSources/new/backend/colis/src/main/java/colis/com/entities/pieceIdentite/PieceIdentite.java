package com.entities.pieceIdentite;

import com.entities.personnes.Personnes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PieceIdentite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long   idPiece;
	private String libbellePiece;
	private String photoPiece;
	@ManyToOne
    @JoinColumn(name = "idPersonne", referencedColumnName="idPersonne")
	private Personnes personnes;

	
	public PieceIdentite() {
		super();
	}


	public long getIdPiece() {
		return idPiece;
	}


	public void setIdPiece(long idPiece) {
		this.idPiece = idPiece;
	}


	public String getLibbellePiece() {
		return libbellePiece;
	}


	public void setLibbellePiece(String libbellePiece) {
		this.libbellePiece = libbellePiece;
	}


	public String getPhotoPiece() {
		return photoPiece;
	}


	public void setPhotoPiece(String photoPiece) {
		this.photoPiece = photoPiece;
	}


	public Personnes getPersonnes() {
		return personnes;
	}


	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}


}
