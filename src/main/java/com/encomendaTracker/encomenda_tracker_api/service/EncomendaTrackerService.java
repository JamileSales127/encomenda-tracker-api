package com.encomendaTracker.encomenda_tracker_api.service;

import com.encomendaTracker.encomenda_tracker_api.client.CorreiosClient;
import com.encomendaTracker.encomenda_tracker_api.client.response.RastreamentoResponse;
import com.encomendaTracker.encomenda_tracker_api.entities.EncomendasEntities;
import com.encomendaTracker.encomenda_tracker_api.mapper.EncomendaMapper;
import com.encomendaTracker.encomenda_tracker_api.repository.EncomendasJpaRepository;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class EncomendaTrackerService {

    private final CorreiosClient correiosClient;
    private final EncomendasJpaRepository encomendasJpaRepository;
    private final EncomendasEntities encomendasEntities;

    public EncomendaTrackerService(CorreiosClient correiosClient, EncomendasJpaRepository encomendasJpaRepository) {
        this.correiosClient = correiosClient;
        this.encomendasJpaRepository = encomendasJpaRepository;
        this.encomendasEntities = new EncomendasEntities();
    }

    public RastreamentoResponse cadastraEncomenda(String codigo) {
        RastreamentoResponse response = correiosClient.rastrearEncomenda(codigo);
        try{
            cadastro(response);
        }catch (FeignException feignException){
            throw feignException;
        }
        return response;
    }

    public RastreamentoResponse buscarEncomenda(String codigo){
        try {
            return correiosClient.rastrearEncomenda(codigo);
        } catch (FeignException e) {
            EncomendasEntities local =encomendasJpaRepository.findByCodigoRastreio(codigo);
            if (local.getCodigoRastreio().equals(codigo)) {
                return null;
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Código não encontrado");
            }
        }
    }

    public RastreamentoResponse cadastro (RastreamentoResponse response){
        EncomendasEntities entity = EncomendaMapper.responseToEntity(response);
        encomendasJpaRepository.save(entity);
        return response;
    }
}
