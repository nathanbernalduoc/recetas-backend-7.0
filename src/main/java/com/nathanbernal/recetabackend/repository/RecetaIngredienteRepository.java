package com.nathanbernal.recetabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nathanbernal.recetabackend.model.RecetaIngrediente;

@Repository
public interface RecetaIngredienteRepository extends JpaRepository<RecetaIngrediente, Long> {

    public List<RecetaIngrediente> findByIdReceta(Long idReceta);

}
