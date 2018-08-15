package com.dao;


import com.entities.personnes.Personnes;
import com.entities.proposerTrajet.ProposerTrajet;
import com.entities.trajets.Trajet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface personnesDao extends JpaRepository<Personnes, Long> {

	@Query("select p from Personnes p where p.nomPersonne like :x")
	public Page<Personnes> search(@Param("x") String pers, Pageable pageable);

	@Query("select p from Personnes p where p.loginPersonne = :loginPersonne and p.passwordPersonne = :passwordPersonne")
	public Personnes findLoginPassPers(@Param("loginPersonne") String loginPersonne, @Param("passwordPersonne") String passwordPersonne);

	@Query("select pt  from ProposerTrajet pt where pt.id.personnes.idPersonne = :id")
	public List<ProposerTrajet> findProposerTrajetByPersonnes(@Param("id") long id);

	@Query("select pt.id.trajet  from ProposerTrajet pt where pt.id.personnes.idPersonne = :id")
	public List<Trajet>  listTrajets(@Param("id") long id);

	/*@Query("select pt.id.personnes from ProposerTrajet pt, Personnes p where pt.id.personnes.idPersonne =p.idPersonne")
	public List<Personnes> listTrajetPrpposerPersonne();

	@Query("select pt.id.trajet from ProposerTrajet pt, Trajet t where pt.id.trajet.idTrajet =t.idTrajet")
	public List<Trajet> listTrajetPrpposerTrajet();*/

	//@Query("select pt.id.trajet from ProposerTrajet pt, Trajet t where pt.id.trajet.idTrajet =t.idTrajet and pt.id.trajet.lieuDepart like :lieuDep and pt.id.trajet.lieuArriver like :lieuArr and pt.id.trajet.dateDepart = :dateDepart and pt.id.trajet.dateArriver = :dateArriver")
	@Query("select pt.id.trajet from ProposerTrajet pt, Trajet t where pt.id.trajet.idTrajet =t.idTrajet and pt.id.trajet.lieuDepart like :lieuDep and pt.id.trajet.lieuArriver like :lieuArr")
	public Page <Trajet> doSearchTrajetProposerPage(
            @Param("lieuDep") String lieuDep,
            @Param("lieuArr") String lieuArr,
			/*@Param("dateDepart") Date dateDepart,
			@Param("dateArriver") Date dateArriver,*/
            Pageable pageable);

	/*@Query("select pt.id.trajet from ProposerTrajet pt, Trajet t where pt.id.trajet.idTrajet =t.idTrajet and pt.id.trajet.lieuDepart =:ld and pt.id.trajet.lieuArriver =:la")
	public Page <Trajet> listTrajetPrpposerTrajet(@Param("ld") String lieuDep, @Param("la") String lieuArr,
												Pageable pageable);*/

	@Query("select pt.id.personnes  from ProposerTrajet pt, Trajet t, Personnes p where t.idTrajet = :id and pt.id.trajet.idTrajet = t.idTrajet group by  t.idTrajet,p.idPersonne order by pt.datePropositionTrajet desc")
	public Personnes listPersonneTrajetProser(@Param("id") long id);

	@Query("select pt.id.trajet from ProposerTrajet pt, Trajet t where pt.id.trajet.idTrajet =t.idTrajet")
	public List<Trajet> listTrajetPrpposerTrajet();
}


//@Query("select pt.id.trajet.idTrajet  from ProposerTrajet pt where pt.id.personnes.idPersonne = :id")
//public List<Long>  listOfTrajets(@Param("id")long id);`

//@Query("select pt.id.trajet.idTrajet  from ProposerTrajet pt where pt.id.personnes.idPersonne = :id")
//public long  findProposerTrajetByTrajets(@Param("id")long id);

//@Query("select pt from ProposerTrajet pt where pt.personnes.idPersonne = ?1")
//Page<ProposerTrajet> findProposerTrajetByPersonnes(long idPersonne, long idTrajet,Pageable pageable);


