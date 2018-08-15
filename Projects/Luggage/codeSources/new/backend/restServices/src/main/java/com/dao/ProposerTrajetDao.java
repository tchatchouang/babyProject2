package com.dao;

import com.entities.proposerTrajet.ProposerTrajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProposerTrajetDao extends JpaRepository<ProposerTrajet, Long> {
	
	
	
	
	//@Query("select pt from ProposerTrajet pt where pt.personnes.idPersonne = :x")
	//public Page<ProposerTrajet> search(@Param("x")String pers, Pageable pageable);
	
	//@Query("select pt from ProposerTrajet pt where pt.personnes.idPersonne = ?1")
	//Page<ProposerTrajet> findCourseSessionByPersonnes(long idPersonne, Pageable pageable);
}
