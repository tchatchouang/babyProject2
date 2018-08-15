package com.entities.proposerTrajet;


import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;

public class ProposerTrajetContext {
	private Trajet trajet;

	private Personnes personnes;
	
	private long poidColis;

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

	public long getPoidColis() {
		return poidColis;
	}

	public void setPoidColis(long poidColis) {
		this.poidColis = poidColis;
	}

}
