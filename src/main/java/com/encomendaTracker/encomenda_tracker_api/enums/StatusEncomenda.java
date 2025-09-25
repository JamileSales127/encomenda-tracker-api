package com.encomendaTracker.encomenda_tracker_api.enums;

public enum StatusEncomenda {
    ENTREGUE("ENTREGUE"),
    DEVOLVIDO("DEVOLVIDO"),
    CAMINHO("CAMINHO"),
    EXTRAVIADO("EXTRAVIADO");

    private final String status;
    StatusEncomenda(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public static String findByStatus(String status){
        for (StatusEncomenda statusInitial : StatusEncomenda.values()){
            if (statusInitial.getStatus().equals(status)){
                return status;
            }
        }
        return null;
    }
}
