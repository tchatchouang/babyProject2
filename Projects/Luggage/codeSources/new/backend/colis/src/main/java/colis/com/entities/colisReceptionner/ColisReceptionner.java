package com.entities.colisReceptionner;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AssociationOverrides({
    @AssociationOverride(name = "id.personnes", joinColumns = @JoinColumn(name = "idPersonne")),
    @AssociationOverride(name = "id.colis", joinColumns = @JoinColumn(name = "idColis"))
})
public class ColisReceptionner implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
    @EmbeddedId
    private ColisReceptionnerId id = new ColisReceptionnerId();
	private Colis colis;
	private Personnes personnes;
	private Date dateReception;
    private Boolean etatColisReceptionner;

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

	public Date getDateReception() {
		return dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

    public Boolean getEtatColisReceptionner() {
        return etatColisReceptionner;
    }

    public void setEtatColisReceptionner(Boolean etatColisReceptionner) {
        this.etatColisReceptionner = etatColisReceptionner;
    }
}
