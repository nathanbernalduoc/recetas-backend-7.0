package com.nathanbernal.recetabackend.service;

import java.util.List;
import com.nathanbernal.recetabackend.model.RecetaIngrediente;

public interface RecetaIngredienteService {

    public List<RecetaIngrediente> getByIdReceta(Long idReceta);

}
