package com.nathanbernal.recetabackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nathanbernal.recetabackend.model.RecetaIngrediente;
import com.nathanbernal.recetabackend.repository.RecetaIngredienteRepository;

@Service
public class RecetaIngredienteServiceImpl implements RecetaIngredienteService {

    @Autowired
    RecetaIngredienteRepository recetaIngredienteRepository;

    @Override
    public List<RecetaIngrediente> getByIdReceta(Long idReceta) {
        return recetaIngredienteRepository
        .findByIdReceta(idReceta);
    }

}
