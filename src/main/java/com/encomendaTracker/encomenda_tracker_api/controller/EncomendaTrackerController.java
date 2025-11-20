package com.encomendaTracker.encomenda_tracker_api.controller;

import com.encomendaTracker.encomenda_tracker_api.client.response.RastreamentoResponse;
import com.encomendaTracker.encomenda_tracker_api.dto.CadastroEncomendaRequest;
import com.encomendaTracker.encomenda_tracker_api.service.EncomendaTrackerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encomenda/tracker")
public class EncomendaTrackerController {

    private final EncomendaTrackerService encomendaTrackerService;

    public EncomendaTrackerController(EncomendaTrackerService encomendaTrackerService) {
        this.encomendaTrackerService = encomendaTrackerService;
    }

    @PostMapping(path = "/encomenda")
    public ResponseEntity<RastreamentoResponse> cadastraEncomenda(@Valid @RequestBody CadastroEncomendaRequest request) {
        RastreamentoResponse response = encomendaTrackerService.cadastraEncomenda(request.getCodigo());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(path = "/encomenda/{codigo}")
    public void buscaEncomenda(String codigo) {
        encomendaTrackerService.buscarEncomenda(codigo);
    }

    @PutMapping(path = "/encomenda/{codigo}")
    public void atualizaStatusEncomenda(String codigo) {
    }

}
