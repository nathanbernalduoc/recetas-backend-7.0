package com.nathanbernal.recetabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathanbernal.recetabackend.model.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {

}
