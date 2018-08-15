package com.entities.proposerTrajet;

import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AssociationOverrides({
    @AssociationOverride(name = "id.trajet", joinColumns = @JoinColumn(name = "idTrajet")),
    @AssociationOverride(name = "id.personnes", joinColumns = @JoinColumn(name = "idPersonne"))
})
public class ProposerTrajet implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
    @EmbeddedId
    private ProposerTrajetId id = new ProposerTrajetId();
	@Temporal(TemporalType.DATE)
	private Date datePropositionTrajet;
	private double poidColis;
	private int nombreVisite;

	
	public ProposerTrajet() {
		super();
	}


	public Date getDatePropositionTrajet() {
		return datePropositionTrajet;
	}


	public void setDatePropositionTrajet(Date datePropositionTrajet) {
		this.datePropositionTrajet = datePropositionTrajet;
	}


	public double getPoidColis() {
		return poidColis;
	}


	public void setPoidColis(double poidColis) {
		this.poidColis = poidColis;
	}


	public int getNombreVisite() {
		return nombreVisite;
	}


	public void setNombreVisite(int nombreVisite) {
		this.nombreVisite = nombreVisite;
	}
	
	public ProposerTrajetId getId() {
		return id;
	}


	public void setId(ProposerTrajetId id) {
		this.id = id;
	}


	public void setPersonnes(Personnes personnes) {
        getId().setPersonnes(personnes);
    }

    public void setTrajet(Trajet trajet) {
        getId().setTrajet(trajet);
    }

}
