package com.entities.proposerTrajet;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProposerTrajet.class)
public abstract class ProposerTrajet_ {

	public static volatile SingularAttribute<ProposerTrajet, Date> datePropositionTrajet;
	public static volatile SingularAttribute<ProposerTrajet, Double> poidColis;
	public static volatile SingularAttribute<ProposerTrajet, ProposerTrajetId> id;
	public static volatile SingularAttribute<ProposerTrajet, Integer> nombreVisite;

	public static final String DATE_PROPOSITION_TRAJET = "datePropositionTrajet";
	public static final String POID_COLIS = "poidColis";
	public static final String ID = "id";
	public static final String NOMBRE_VISITE = "nombreVisite";

}

