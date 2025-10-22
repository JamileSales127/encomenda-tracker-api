package com.encomendaTracker.encomenda_tracker_api.service;

import com.encomendaTracker.encomenda_tracker_api.client.CorreiosClient;
import com.encomendaTracker.encomenda_tracker_api.client.response.RastreamentoResponse;
import org.springframework.stereotype.Service;

@Service
public class EncomendaTrackerService {

    private final CorreiosClient correiosClient;

    public EncomendaTrackerService(CorreiosClient correiosClient) {
        this.correiosClient = correiosClient;
    }

    public RastreamentoResponse buscarEncomenda(String codigo){
        return correiosClient.rastrearEncomenda(codigo);
    }
}
