package com.entities.proposerColis;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;

public class ProposerColisContext {
	private Trajet trajet;

	private Personnes personnes;
	
	private Colis colis;
	

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

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}
}
