package com.entities.conversations;

import com.entities.personnes.Personnes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conversations.class)
public abstract class Conversations_ {

	public static volatile SingularAttribute<Conversations, Long> idConversation;
	public static volatile SingularAttribute<Conversations, Date> dateCreation;
	public static volatile SingularAttribute<Conversations, Personnes> personnes2;
	public static volatile SingularAttribute<Conversations, Personnes> personnes1;

	public static final String ID_CONVERSATION = "idConversation";
	public static final String DATE_CREATION = "dateCreation";
	public static final String PERSONNES2 = "personnes2";
	public static final String PERSONNES1 = "personnes1";

}

