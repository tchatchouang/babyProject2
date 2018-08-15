package com.entities.messages;

import com.entities.conversations.Conversations;
import com.entities.personnes.Personnes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Message.class)
public abstract class Message_ {

	public static volatile SingularAttribute<Message, Long> idMessage;
	public static volatile SingularAttribute<Message, String> cotenueMessage;
	public static volatile SingularAttribute<Message, Conversations> conversations;
	public static volatile SingularAttribute<Message, Personnes> personnes;
	public static volatile SingularAttribute<Message, String> etatMessage;
	public static volatile SingularAttribute<Message, Date> dateMessage;

	public static final String ID_MESSAGE = "idMessage";
	public static final String COTENUE_MESSAGE = "cotenueMessage";
	public static final String CONVERSATIONS = "conversations";
	public static final String PERSONNES = "personnes";
	public static final String ETAT_MESSAGE = "etatMessage";
	public static final String DATE_MESSAGE = "dateMessage";

}

