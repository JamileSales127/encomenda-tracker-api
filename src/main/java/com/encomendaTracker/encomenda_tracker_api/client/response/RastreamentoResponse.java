package com.encomendaTracker.encomenda_tracker_api.client.response;

import lombok.Data;

import java.util.List;

public class RastreamentoResponse {
    private String codigo;
    private String status;
    private List<Evento> eventos;

    @Data
    public static class Evento {
        private String data;
        private String hora;
        private String local;
        private String status;
    }
}
