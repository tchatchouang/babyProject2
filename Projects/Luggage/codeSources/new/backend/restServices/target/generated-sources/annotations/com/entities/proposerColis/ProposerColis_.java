package com.entities.proposerColis;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProposerColis.class)
public abstract class ProposerColis_ {

	public static volatile SingularAttribute<ProposerColis, Trajet> trajet;
	public static volatile SingularAttribute<ProposerColis, Date> dateProposition;
	public static volatile SingularAttribute<ProposerColis, ProposerColisId> id;
	public static volatile SingularAttribute<ProposerColis, Colis> colis;
	public static volatile SingularAttribute<ProposerColis, Personnes> personnes;

	public static final String TRAJET = "trajet";
	public static final String DATE_PROPOSITION = "dateProposition";
	public static final String ID = "id";
	public static final String COLIS = "colis";
	public static final String PERSONNES = "personnes";

}

