package com.encomendaTracker.encomenda_tracker_api.client;

import com.encomendaTracker.encomenda_tracker_api.client.response.RastreamentoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "correiosClient", url = "https://proxyapp.correios.com.br/v1/sro-rastro")
public interface CorreiosClient {

    @GetMapping("/track/{codigo}")
    RastreamentoResponse rastrearEncomenda(
            @PathVariable("codigo") String codigo
    );
}
