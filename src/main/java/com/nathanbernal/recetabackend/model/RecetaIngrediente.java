package com.nathanbernal.recetabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "receta_ingrediente")
public class RecetaIngrediente {

    @Id
    @Column(name = "receta_ingrediente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecetaIngrediente;
    @Column(name = "receta_id")
    private Long idReceta;
    @Column(name = "nombre")
    private String nombre;

    RecetaIngrediente() {}

    RecetaIngrediente(Long idRecetaIngrediente, Long idReceta, String nombre) {
        this.idRecetaIngrediente = idRecetaIngrediente;
        this.idReceta = idReceta;
        this.nombre = nombre;
    }

    public Long getIdRecetaIngrediente() {
        return idRecetaIngrediente;
    }

    public void setIdRecetaIngrediente(Long idRecetaIngrediente) {
        this.idRecetaIngrediente = idRecetaIngrediente;
    }

    public Long getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Long idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
