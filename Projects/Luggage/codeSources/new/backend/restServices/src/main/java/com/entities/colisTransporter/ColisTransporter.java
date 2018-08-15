package com.entities.colisTransporter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AssociationOverrides({
    @AssociationOverride(name = "id.personnes", joinColumns = @JoinColumn(name = "idPersonne")),
    @AssociationOverride(name = "id.colis", joinColumns = @JoinColumn(name = "idColis"))
})
public class ColisTransporter implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonIgnore
    @EmbeddedId
    private ColisTransporterId id = new ColisTransporterId();
    //private Colis colis;
    //private Personnes personnes;
	private Date dateTransport;
    private Boolean etatColisTransporter;

	/*public Colis getColis() {
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
	}*/

	public Date getDateTransport() {
		return dateTransport;
	}

	public void setDateTransport(Date dateTransport) {
		this.dateTransport = dateTransport;
	}

    public Boolean getEtatColisTransporter() {
        return etatColisTransporter;
    }

    public void setEtatColisTransporter(Boolean etatColisTransporter) {
        this.etatColisTransporter = etatColisTransporter;
    }
	
	
}
