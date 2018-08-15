package com.dao;

import com.entities.conversations.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConversationsDao extends JpaRepository<Conversations, Long> {

	@Query("select c  from Conversations c where c.personnes1.idPersonne = :id or c.personnes2.idPersonne = :id")
	public List<Conversations>  listConversations(@Param("id") long id);
}
