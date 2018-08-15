package com.entities.colisReceptionner;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ColisReceptionnerId.class)
public abstract class ColisReceptionnerId_ {

	public static volatile SingularAttribute<ColisReceptionnerId, Personnes> personnes;
	public static volatile SingularAttribute<ColisReceptionnerId, Colis> colis;

	public static final String PERSONNES = "personnes";
	public static final String COLIS = "colis";

}

