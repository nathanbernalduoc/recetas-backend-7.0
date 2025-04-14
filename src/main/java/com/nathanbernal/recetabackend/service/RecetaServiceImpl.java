package com.nathanbernal.recetabackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanbernal.recetabackend.model.Receta;
import com.nathanbernal.recetabackend.repository.RecetaRepository;

@Service
public class RecetaServiceImpl implements RecetaService {

    @Autowired
    RecetaRepository recetaRepository;

    @Override
    public List<Receta> getAllRecetas() {
        return recetaRepository.findAll();
    }

    @Override
    public Optional<Receta> getByIdReceta(Long id) {
        return recetaRepository.findById(id);
    }

}
