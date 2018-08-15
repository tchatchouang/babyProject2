package com.entities.proposerColis;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AssociationOverrides({
    @AssociationOverride(name = "id.trajet", joinColumns = @JoinColumn(name = "idTrajet")),
    @AssociationOverride(name = "id.personnes", joinColumns = @JoinColumn(name = "idPersonne")),
    @AssociationOverride(name = "id.colis", joinColumns = @JoinColumn(name = "idColis"))
})
public class ProposerColis implements Serializable{

	private static final long serialVersionUID = 1L;

	@JsonIgnore
    @EmbeddedId
    private ProposerColisId id = new ProposerColisId();
	private Colis colis;
	private Personnes personnes;
	private Trajet trajet;
	private Date dateProposition;

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}

	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Date getDateProposition() {
		return dateProposition;
	}

	public void setDateProposition(Date dateProposition) {
		this.dateProposition = dateProposition;
	}

	@Override
	public String toString() {
		return "ProposerColis [colis=" + colis + ", personnes=" + personnes + ", trajet=" + trajet
				+ ", dateProposition=" + dateProposition + "]";
	}
	
	
}
