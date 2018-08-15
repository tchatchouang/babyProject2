package com.entities.colisTransporter;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ColisTransporterId.class)
public abstract class ColisTransporterId_ {

	public static volatile SingularAttribute<ColisTransporterId, Personnes> personnes;
	public static volatile SingularAttribute<ColisTransporterId, Colis> colis;

	public static final String PERSONNES = "personnes";
	public static final String COLIS = "colis";

}

