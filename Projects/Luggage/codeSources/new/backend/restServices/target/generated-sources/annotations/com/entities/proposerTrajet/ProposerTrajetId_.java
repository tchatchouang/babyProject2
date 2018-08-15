package com.entities.proposerTrajet;

import com.entities.personnes.Personnes;
import com.entities.trajets.Trajet;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProposerTrajetId.class)
public abstract class ProposerTrajetId_ {

	public static volatile SingularAttribute<ProposerTrajetId, Trajet> trajet;
	public static volatile SingularAttribute<ProposerTrajetId, Personnes> personnes;

	public static final String TRAJET = "trajet";
	public static final String PERSONNES = "personnes";

}

