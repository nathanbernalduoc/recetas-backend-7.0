package com.nathanbernal.recetabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recetas")
public class Receta {

    @Id
    @Column(name = "receta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReceta;
    @Column(name = "nombre")
    private String nombre;

    Receta() {
    }
    
    Receta(Long idReceta, String nombre) {
        this.idReceta=idReceta;
        this.nombre=nombre;
    }

    public Long getRecetaId() {
        return idReceta;
    }

    public void setRecetaId(Long idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
