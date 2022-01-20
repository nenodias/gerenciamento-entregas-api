package com.aguiardafa.gerenciamentoentregasapi.api.controller;

import com.aguiardafa.gerenciamentoentregasapi.domain.model.Entrega;
import com.aguiardafa.gerenciamentoentregasapi.domain.service.SolicitacaoEntregaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/entregas")
public class EntregaController {

    private SolicitacaoEntregaService solicitacaoEntregaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entrega solicitar(@RequestBody Entrega entrega) {
        return solicitacaoEntregaService.solicitar(entrega);
    }

}
