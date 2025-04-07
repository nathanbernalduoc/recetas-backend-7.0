package com.nathanbernal.recetabackend;

public class Receta {

    private int recetaId;
    private String receta;
    private String ingredientes;
    private String pasos;

    Receta(int recetaId, String receta, String ingredientes, String pasos) {
        this.recetaId=recetaId;
        this.receta=receta;
        this.ingredientes=ingredientes;
        this.pasos=pasos;
    }

    public int getRecetaId() {
        return recetaId;
    }
    public void setRecetaId(int recetaId) {
        this.recetaId = recetaId;
    }
    public String getReceta() {
        return receta;
    }
    public void setReceta(String receta) {
        this.receta = receta;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String getPasos() {
        return pasos;
    }
    public void setPasos(String pasos) {
        this.pasos = pasos;
    }
    
}
