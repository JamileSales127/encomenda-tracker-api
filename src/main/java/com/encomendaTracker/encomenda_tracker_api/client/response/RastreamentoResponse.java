package com.encomendaTracker.encomenda_tracker_api.client.response;

import lombok.Data;

import java.util.List;
@Data
public class RastreamentoResponse {
    private String codigo;
    private String status;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
