package com.encomendaTracker.encomenda_tracker_api.repository;

import com.encomendaTracker.encomenda_tracker_api.entities.EncomendasEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncomendasJpaRepository extends JpaRepository<EncomendasEntities, Long> {
    EncomendasEntities findByCodigoRastreio(String codigoRastreio);
}
