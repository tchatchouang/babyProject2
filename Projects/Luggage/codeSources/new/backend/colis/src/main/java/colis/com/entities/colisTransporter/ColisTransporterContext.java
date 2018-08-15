package com.entities.colisTransporter;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;

public class ColisTransporterContext {

	private Personnes personnes;
	
	private Colis colis;
	
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
