package com.example.teste.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lento")
public class LentoController {
    @GetMapping
    public ResponseEntity<String> simularDelay(@RequestParam(defaultValue = "5") int delay) throws InterruptedException {
        // Limita o delay máximo a 30 segundos por segurança
        if (delay < 0 || delay > 30) {
            return ResponseEntity.badRequest().body("Delay inválido. Use um valor entre 0 e 30 segundos.");
        }

        Thread.sleep(delay * 1000L); // Converte segundos para milissegundos
        return ResponseEntity.ok("Resposta após " + delay + " segundos de delay.");
    }
}
