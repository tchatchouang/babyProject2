
package com.dao;

import com.entities.messages.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageDao extends JpaRepository<Message, Long> {
	
	@Query("select m  from Message m where m.conversations.idConversation = :id")
	public List<Message>  listMessageFromConversation(@Param("id") long id);

}

