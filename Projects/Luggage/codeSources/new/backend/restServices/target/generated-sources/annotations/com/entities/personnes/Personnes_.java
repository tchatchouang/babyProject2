package com.entities.personnes;

import com.entities.colisReceptionner.ColisReceptionner;
import com.entities.colisTransporter.ColisTransporter;
import com.entities.proposerColis.ProposerColis;
import com.entities.proposerTrajet.ProposerTrajet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Personnes.class)
public abstract class Personnes_ {

	public static volatile SingularAttribute<Personnes, String> photoPersonne;
	public static volatile SingularAttribute<Personnes, String> passwordPersonne;
	public static volatile SingularAttribute<Personnes, String> loginPersonne;
	public static volatile SingularAttribute<Personnes, Long> numeroTelephonePersonne;
	public static volatile SingularAttribute<Personnes, String> adresseCompletePersonne;
	public static volatile SingularAttribute<Personnes, String> paysPersonne;
	public static volatile SingularAttribute<Personnes, Date> dateNaissancePersonne;
	public static volatile SingularAttribute<Personnes, String> emailPersonne;
	public static volatile SingularAttribute<Personnes, Long> idPersonne;
	public static volatile SetAttribute<Personnes, ProposerColis> proposerColis;
	public static volatile SingularAttribute<Personnes, String> statusPersonne;
	public static volatile SetAttribute<Personnes, ColisReceptionner> colisReceptionners;
	public static volatile SingularAttribute<Personnes, String> nomPersonne;
	public static volatile SingularAttribute<Personnes, String> prenomPersonn;
	public static volatile SetAttribute<Personnes, ProposerTrajet> proposerTrajet;
	public static volatile SetAttribute<Personnes, ColisTransporter> colisTransporter;

	public static final String PHOTO_PERSONNE = "photoPersonne";
	public static final String PASSWORD_PERSONNE = "passwordPersonne";
	public static final String LOGIN_PERSONNE = "loginPersonne";
	public static final String NUMERO_TELEPHONE_PERSONNE = "numeroTelephonePersonne";
	public static final String ADRESSE_COMPLETE_PERSONNE = "adresseCompletePersonne";
	public static final String PAYS_PERSONNE = "paysPersonne";
	public static final String DATE_NAISSANCE_PERSONNE = "dateNaissancePersonne";
	public static final String EMAIL_PERSONNE = "emailPersonne";
	public static final String ID_PERSONNE = "idPersonne";
	public static final String PROPOSER_COLIS = "proposerColis";
	public static final String STATUS_PERSONNE = "statusPersonne";
	public static final String COLIS_RECEPTIONNERS = "colisReceptionners";
	public static final String NOM_PERSONNE = "nomPersonne";
	public static final String PRENOM_PERSONN = "prenomPersonn";
	public static final String PROPOSER_TRAJET = "proposerTrajet";
	public static final String COLIS_TRANSPORTER = "colisTransporter";

}

