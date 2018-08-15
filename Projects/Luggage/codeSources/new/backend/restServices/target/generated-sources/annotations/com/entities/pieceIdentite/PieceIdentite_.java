package com.entities.pieceIdentite;

import com.entities.personnes.Personnes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PieceIdentite.class)
public abstract class PieceIdentite_ {

	public static volatile SingularAttribute<PieceIdentite, Long> idPiece;
	public static volatile SingularAttribute<PieceIdentite, String> photoPiece;
	public static volatile SingularAttribute<PieceIdentite, Personnes> personnes;
	public static volatile SingularAttribute<PieceIdentite, String> libbellePiece;

	public static final String ID_PIECE = "idPiece";
	public static final String PHOTO_PIECE = "photoPiece";
	public static final String PERSONNES = "personnes";
	public static final String LIBBELLE_PIECE = "libbellePiece";

}

