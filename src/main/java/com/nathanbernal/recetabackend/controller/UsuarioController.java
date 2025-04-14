package com.nathanbernal.recetabackend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.recetabackend.model.Login;
import com.nathanbernal.recetabackend.model.Usuario;
import com.nathanbernal.recetabackend.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    public UsuarioController() {
    }

    @PostMapping("/login")
    public Login getUsuario(@RequestBody String user, @RequestBody String password) {
        Login login = new Login();
        Optional<Usuario> usuario = usuarioService.getByUsuario(user);
        if (!usuario.isEmpty()) {
            login = new Login(user, "token-asdasd123");
            login.setStatus("success");
        } else {
            login.setStatus("error");
        } 
        return login;
    }

}
