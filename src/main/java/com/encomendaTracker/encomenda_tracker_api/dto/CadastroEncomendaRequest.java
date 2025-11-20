package com.encomendaTracker.encomenda_tracker_api.dto;

import jakarta.validation.constraints.NotBlank;

public class CadastroEncomendaRequest {

    @NotBlank(message = "Código de rastreio é obrigatório")
    private String codigo;

    public CadastroEncomendaRequest() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}