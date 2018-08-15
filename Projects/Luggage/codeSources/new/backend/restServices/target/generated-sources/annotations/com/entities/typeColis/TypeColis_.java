package com.entities.typeColis;

import com.entities.colis.Colis;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeColis.class)
public abstract class TypeColis_ {

	public static volatile SingularAttribute<TypeColis, Long> idTypeColis;
	public static volatile SingularAttribute<TypeColis, String> libelleTypeColis;
	public static volatile SingularAttribute<TypeColis, Colis> colis;

	public static final String ID_TYPE_COLIS = "idTypeColis";
	public static final String LIBELLE_TYPE_COLIS = "libelleTypeColis";
	public static final String COLIS = "colis";

}

