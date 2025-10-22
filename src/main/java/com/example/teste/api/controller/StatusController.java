package com.example.teste.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping
    public ResponseEntity<String> verificarStatus() {
        long inicio = System.currentTimeMillis();

        // Simula um pequeno processamento
        try {
            Thread.sleep(50); // 50 milissegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long fim = System.currentTimeMillis();
        long tempoResposta = fim - inicio;

        return ResponseEntity.ok("Tempo de resposta: " + tempoResposta + "ms");
    }

}
