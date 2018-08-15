package com.dao;

import com.entities.colis.Colis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColisDao extends JpaRepository<Colis, Long> {

}
