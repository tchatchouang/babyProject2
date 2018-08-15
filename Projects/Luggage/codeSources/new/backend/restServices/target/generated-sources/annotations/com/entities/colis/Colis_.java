package com.entities.colis;

import com.entities.colisReceptionner.ColisReceptionner;
import com.entities.colisTransporter.ColisTransporter;
import com.entities.proposerColis.ProposerColis;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Colis.class)
public abstract class Colis_ {

	public static volatile SingularAttribute<Colis, Long> idColis;
	public static volatile SetAttribute<Colis, ProposerColis> proposerColis;
	public static volatile SetAttribute<Colis, ColisReceptionner> colisReceptionner;
	public static volatile SingularAttribute<Colis, Double> poidColis;
	public static volatile SingularAttribute<Colis, String> libelleColis;
	public static volatile SetAttribute<Colis, ColisTransporter> colisTransporter;

	public static final String ID_COLIS = "idColis";
	public static final String PROPOSER_COLIS = "proposerColis";
	public static final String COLIS_RECEPTIONNER = "colisReceptionner";
	public static final String POID_COLIS = "poidColis";
	public static final String LIBELLE_COLIS = "libelleColis";
	public static final String COLIS_TRANSPORTER = "colisTransporter";

}

