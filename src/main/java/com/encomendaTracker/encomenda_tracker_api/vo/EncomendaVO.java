package com.encomendaTracker.encomenda_tracker_api.vo;

import com.encomendaTracker.encomenda_tracker_api.enums.StatusEncomenda;

import java.time.LocalDateTime;

public class EncomendaVO {
    private int id;
    private Long codigoRastreio;
    private StatusEncomenda status;
    private LocalDateTime dateUpdate;
    private String descricao;
    private String ultimoLocal;

    public EncomendaVO() {

    }

    public EncomendaVO(int id, StatusEncomenda status, Long codigoRastreio, LocalDateTime dateUpdate,  String descricao, String ultimoLocal) {
        this.id = id;
        this.status = status;
        this.codigoRastreio = codigoRastreio;
        this.dateUpdate = dateUpdate;
        this.descricao = descricao;
        this.ultimoLocal = ultimoLocal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUltimoLocal() {
        return ultimoLocal;
    }

    public void setUltimoLocal(String ultimoLocal) {
        this.ultimoLocal = ultimoLocal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(Long codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public StatusEncomenda getStatus() {
        return status;
    }

    public void setStatus(StatusEncomenda status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EncomendaVO{" +
                "id=" + id +
                ", codigoRastreio=" + codigoRastreio +
                ", status=" + status +
                ", dateUpdate=" + dateUpdate +
                '}';
    }
}
