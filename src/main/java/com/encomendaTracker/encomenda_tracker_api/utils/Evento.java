package com.encomendaTracker.encomenda_tracker_api.utils;

import lombok.Data;

@Data
public class Evento {
    private String data;
    private String hora;
    private String local;
    private String status;
}
