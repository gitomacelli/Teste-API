package com.example.teste.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    // endpoint de multiplicação
    @GetMapping("/multiplicar")
    public double multiplicar(
            @RequestParam double a,
            @RequestParam double b) {
        return a * b;
    }

    // endpoint de divisão
    @GetMapping("/dividir")
    public double dividir(
            @RequestParam double a,
            @RequestParam double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
