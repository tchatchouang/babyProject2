package com.entities.proposerTrajet;

import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ProposerTrajetId implements Serializable{
	
	private static final long serialVersionUID = 1L;


	//@Column(name = "idTrajet", nullable = false)
	@ManyToOne
	private Trajet trajet;

	//@Column(name = "idPersonne", nullable = false)
	@ManyToOne
	private Personnes personnes;
	
	public ProposerTrajetId() {
		
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}
	
	

}
