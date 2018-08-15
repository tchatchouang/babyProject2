package com.entities.avis;

import com.entities.personnes.Personnes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Avis.class)
public abstract class Avis_ {

	public static volatile SingularAttribute<Avis, Long> idAvis;
	public static volatile SingularAttribute<Avis, String> valeurAvis;
	public static volatile SingularAttribute<Avis, String> libelleAvis;
	public static volatile SingularAttribute<Avis, Personnes> personnes;

	public static final String ID_AVIS = "idAvis";
	public static final String VALEUR_AVIS = "valeurAvis";
	public static final String LIBELLE_AVIS = "libelleAvis";
	public static final String PERSONNES = "personnes";

}

