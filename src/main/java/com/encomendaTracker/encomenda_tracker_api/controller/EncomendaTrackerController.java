package com.encomendaTracker.encomenda_tracker_api.controller;

import com.encomendaTracker.encomenda_tracker_api.service.EncomendaTrackerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/encomenda/tracker")
public class EncomendaTrackerController {

    private final EncomendaTrackerService encomendaTrackerService;

    public EncomendaTrackerController(EncomendaTrackerService encomendaTrackerService) {
        this.encomendaTrackerService = encomendaTrackerService;
    }

    @PostMapping(path = "/encomenda")
    public void cadastraEncomenda() {
    }

    @GetMapping(path = "/encomenda/{codigo}")
    public void buscaEncomenda(String codigo) {
    }

    @PutMapping(path = "/encomenda/{codigo}")
    public void atualizaStatusEncomenda(String codigo) {
    }

}
