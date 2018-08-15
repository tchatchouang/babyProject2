package com.entities.trajets;

import com.entities.proposerColis.ProposerColis;
import com.entities.proposerTrajet.ProposerTrajet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trajet.class)
public abstract class Trajet_ {

	public static volatile SingularAttribute<Trajet, Float> latitudeArriver;
	public static volatile SingularAttribute<Trajet, Long> idTrajet;
	public static volatile SingularAttribute<Trajet, String> photoPaysArrive;
	public static volatile SingularAttribute<Trajet, String> paysDepart;
	public static volatile SingularAttribute<Trajet, Float> latitudeDepart;
	public static volatile SingularAttribute<Trajet, Float> longitudeArriver;
	public static volatile SingularAttribute<Trajet, String> lieuDepart;
	public static volatile SingularAttribute<Trajet, Date> dateDepart;
	public static volatile SingularAttribute<Trajet, String> photoPaysDepart;
	public static volatile SingularAttribute<Trajet, String> libelleTrajet;
	public static volatile SingularAttribute<Trajet, String> paysArrive;
	public static volatile SingularAttribute<Trajet, String> etatTrajet;
	public static volatile SingularAttribute<Trajet, Date> dateArriver;
	public static volatile SingularAttribute<Trajet, String> lieuArriver;
	public static volatile SingularAttribute<Trajet, Float> longitudeDepart;
	public static volatile SetAttribute<Trajet, ProposerColis> proposerColis;
	public static volatile SingularAttribute<Trajet, String> visibleSurCarte;
	public static volatile SetAttribute<Trajet, ProposerTrajet> proposerTrajet;

	public static final String LATITUDE_ARRIVER = "latitudeArriver";
	public static final String ID_TRAJET = "idTrajet";
	public static final String PHOTO_PAYS_ARRIVE = "photoPaysArrive";
	public static final String PAYS_DEPART = "paysDepart";
	public static final String LATITUDE_DEPART = "latitudeDepart";
	public static final String LONGITUDE_ARRIVER = "longitudeArriver";
	public static final String LIEU_DEPART = "lieuDepart";
	public static final String DATE_DEPART = "dateDepart";
	public static final String PHOTO_PAYS_DEPART = "photoPaysDepart";
	public static final String LIBELLE_TRAJET = "libelleTrajet";
	public static final String PAYS_ARRIVE = "paysArrive";
	public static final String ETAT_TRAJET = "etatTrajet";
	public static final String DATE_ARRIVER = "dateArriver";
	public static final String LIEU_ARRIVER = "lieuArriver";
	public static final String LONGITUDE_DEPART = "longitudeDepart";
	public static final String PROPOSER_COLIS = "proposerColis";
	public static final String VISIBLE_SUR_CARTE = "visibleSurCarte";
	public static final String PROPOSER_TRAJET = "proposerTrajet";

}

