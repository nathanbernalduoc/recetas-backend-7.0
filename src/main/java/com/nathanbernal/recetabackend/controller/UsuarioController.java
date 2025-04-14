package com.nathanbernal.recetabackend.controller;

import java.lang.classfile.ClassFile.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.recetabackend.model.Receta;
import com.nathanbernal.recetabackend.model.RecetaIngrediente;
import com.nathanbernal.recetabackend.model.Usuario;
import com.nathanbernal.recetabackend.repository.RecetaRepository;
import com.nathanbernal.recetabackend.service.RecetaIngredienteService;
import com.nathanbernal.recetabackend.service.RecetaService;
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
    public Optional<Usuario> getUsuario(@PathVariable String usuario,) {
        return usuarioService.getByUsuario(usuario);
    }

    @GetMapping("/logout")
    public List<RecetaIngrediente> getIngredientes(@PathVariable Long idReceta) {
        return recetaIngredienteService.getByIdReceta(idReceta);
    }

}
