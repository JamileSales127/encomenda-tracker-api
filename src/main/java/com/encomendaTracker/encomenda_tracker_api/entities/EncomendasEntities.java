package com.encomendaTracker.encomenda_tracker_api.entities;

import com.encomendaTracker.encomenda_tracker_api.enums.StatusEncomenda;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "encomendas")
public class EncomendasEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String codigoRastreio;

    private String descricao;

    private String ultimoLocal;

    @Enumerated(EnumType.STRING)
    private StatusEncomenda status;

    private LocalDateTime dataDeAtualizacao;


    public EncomendasEntities() {

    }

    public EncomendasEntities(String codigoRastreio, String descricao, Long id, String ultimoLocal, StatusEncomenda status, LocalDateTime dataDeAtualizacao) {
        this.codigoRastreio = codigoRastreio;
        this.descricao = descricao;
        this.id = id;
        this.ultimoLocal = ultimoLocal;
        this.status = status;
        this.dataDeAtualizacao = dataDeAtualizacao;
    }


    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public LocalDateTime getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public StatusEncomenda getStatus() {
        return status;
    }

    public String getUltimoLocal() {
        return ultimoLocal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
