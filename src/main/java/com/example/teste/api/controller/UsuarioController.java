package com.example.teste.api.controller;

import com.example.teste.api.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @PostMapping
    public String cadastrarUsuario(@RequestBody Usuario usuario) {
        return "Usuário cadastrado: " + usuario.getNome();
    }
}
