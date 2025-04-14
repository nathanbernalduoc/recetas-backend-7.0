package com.nathanbernal.recetabackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.recetabackend.model.Receta;
import com.nathanbernal.recetabackend.model.RecetaIngrediente;
import com.nathanbernal.recetabackend.service.RecetaIngredienteService;
import com.nathanbernal.recetabackend.service.RecetaService;

@RestController
public class RecetaController {
    
    @Autowired
    RecetaService recetaService;
    RecetaIngredienteService recetaIngredienteService;

    public RecetaController() {
    }

    @GetMapping("/recetas")
    public List<Receta> getRecetas() {
        return recetaService.getAllRecetas();
    }

    @GetMapping("/recetas/{id}")
    public Optional<Receta> getRecetas(@PathVariable Long id) {
        return recetaService.getByIdReceta(id);
    }

    @GetMapping("/recetas/ingredientes/{idReceta}")
    public List<RecetaIngrediente> getIngredientes(@PathVariable Long idReceta) {
        return recetaIngredienteService.getByIdReceta(idReceta);
    }

}
