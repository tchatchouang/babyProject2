package com.entities.colisReceptionner;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ColisReceptionner.class)
public abstract class ColisReceptionner_ {

	public static volatile SingularAttribute<ColisReceptionner, ColisReceptionnerId> id;
	public static volatile SingularAttribute<ColisReceptionner, Colis> colis;
	public static volatile SingularAttribute<ColisReceptionner, Personnes> personnes;
	public static volatile SingularAttribute<ColisReceptionner, Date> dateReception;
	public static volatile SingularAttribute<ColisReceptionner, Boolean> etatColisReceptionner;

	public static final String ID = "id";
	public static final String COLIS = "colis";
	public static final String PERSONNES = "personnes";
	public static final String DATE_RECEPTION = "dateReception";
	public static final String ETAT_COLIS_RECEPTIONNER = "etatColisReceptionner";

}

