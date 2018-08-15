package com.entities.colisTransporter;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ColisTransporter.class)
public abstract class ColisTransporter_ {

	public static volatile SingularAttribute<ColisTransporter, Date> dateTransport;
	public static volatile SingularAttribute<ColisTransporter, Boolean> etatColisTransporter;
	public static volatile SingularAttribute<ColisTransporter, ColisTransporterId> id;

	public static final String DATE_TRANSPORT = "dateTransport";
	public static final String ETAT_COLIS_TRANSPORTER = "etatColisTransporter";
	public static final String ID = "id";

}

