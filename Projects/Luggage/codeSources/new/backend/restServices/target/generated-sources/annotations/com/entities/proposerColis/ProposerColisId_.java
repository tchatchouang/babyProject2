package com.entities.proposerColis;

import com.entities.colis.Colis;
import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProposerColisId.class)
public abstract class ProposerColisId_ {

	public static volatile SingularAttribute<ProposerColisId, Trajet> trajet;
	public static volatile SingularAttribute<ProposerColisId, Personnes> personnes;
	public static volatile SingularAttribute<ProposerColisId, Colis> colis;

	public static final String TRAJET = "trajet";
	public static final String PERSONNES = "personnes";
	public static final String COLIS = "colis";

}

