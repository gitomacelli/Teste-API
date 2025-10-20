package com.example.teste.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public List<Map<String, String>> listarProdutos() {
        // Retorna uma lista simples de produtos fixos
        List<Map<String, String>> produtos = new ArrayList<>();

        produtos.add(Map.of("id", "1", "nome", "Camiseta", "categoria", "vestuario"));
        produtos.add(Map.of("id", "2", "nome", "Calça Jeans", "categoria", "vestuario"));
        produtos.add(Map.of("id", "3", "nome", "Notebook", "categoria", "eletronico"));

        return produtos;
    }

}
