package com.nathanbernal.recetabackend.service;

import java.util.List;
import java.util.Optional;

import com.nathanbernal.recetabackend.model.Receta;

public interface RecetaService {

    public List<Receta> getAllRecetas();
    public Optional<Receta> getByIdReceta(Long id);

}
