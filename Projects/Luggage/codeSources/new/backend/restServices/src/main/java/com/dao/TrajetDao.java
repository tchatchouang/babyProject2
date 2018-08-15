package com.dao;


import com.entities.trajets.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetDao extends JpaRepository<Trajet, Long> {
}
