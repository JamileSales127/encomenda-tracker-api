package com.encomendaTracker.encomenda_tracker_api.repository;

import com.encomendaTracker.encomenda_tracker_api.entities.EncomendasEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncomendasJpaRepository extends JpaRepository<EncomendasEntities<V>, Long> {
}
