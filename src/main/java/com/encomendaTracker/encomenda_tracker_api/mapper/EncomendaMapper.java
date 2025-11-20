package com.encomendaTracker.encomenda_tracker_api.mapper;

import com.encomendaTracker.encomenda_tracker_api.client.response.RastreamentoResponse;
import com.encomendaTracker.encomenda_tracker_api.entities.EncomendasEntities;
import com.encomendaTracker.encomenda_tracker_api.enums.StatusEncomenda;
import com.encomendaTracker.encomenda_tracker_api.vo.EncomendaVO;

import java.time.LocalDateTime;

public class EncomendaMapper {

    // Converte Entity (banco) → Response (para retornar quando buscar do banco local)
    public static RastreamentoResponse toResponse(EncomendasEntities entity) {
        if (entity == null) {
            return null;
        }

        RastreamentoResponse response = new RastreamentoResponse();
        response.setCodigo(entity.getCodigoRastreio());
        response.setStatus(entity.getStatus().name());

        return response;
    }

    // Converte Response (Correios) → Entity (para salvar no banco)
    public static EncomendasEntities responseToEntity(RastreamentoResponse response) {
        if (response == null) {
            return null;
        }
        EncomendasEntities entity = new EncomendasEntities();
        entity.setCodigoRastreio(response.getCodigo());
        entity.setStatus(StatusEncomenda.findByStatus(response.getStatus()));
        entity.setDataDeAtualizacao(LocalDateTime.now());

        return entity;
    }
}