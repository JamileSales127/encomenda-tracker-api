package com.encomendaTracker.encomenda_tracker_api.vo;

import com.encomendaTracker.encomenda_tracker_api.enums.StatusEncomenda;

import java.time.LocalDateTime;

public class EncomendaVO {
    private int id;
    private Long codigoRastreio;
    private StatusEncomenda status;
    private LocalDateTime dateUpdate;
    private LocalDateTime datePrevistaEntrega;

    public EncomendaVO(){

    }

    public EncomendaVO(int id, StatusEncomenda status, Long codigoRastreio, LocalDateTime dateUpdate, LocalDateTime datePrevistaEntrega) {
        this.id = id;
        this.status = status;
        this.codigoRastreio = codigoRastreio;
        this.dateUpdate = dateUpdate;
        this.datePrevistaEntrega = datePrevistaEntrega;
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

    public LocalDateTime getDatePrevistaEntrega() {
        return datePrevistaEntrega;
    }

    public void setDatePrevistaEntrega(LocalDateTime datePrevistaEntrega) {
        this.datePrevistaEntrega = datePrevistaEntrega;
    }

    @Override
    public String toString() {
        return "EncomendaVO{" +
                "id=" + id +
                ", codigoRastreio=" + codigoRastreio +
                ", status=" + status +
                ", dateUpdate=" + dateUpdate +
                ", datePrevistaEntrega=" + datePrevistaEntrega +
                '}';
    }
}
