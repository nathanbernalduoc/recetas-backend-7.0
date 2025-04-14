package com.nathanbernal.recetabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column(name = "usuario_id")
    private Long idUsuario;
    @Column(name = "usuario_rol_id")
    private Long idUsuarioRol;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "vigencia_flag")
    private int vigenciaFlag;

    Usuario() {

    }

    Usuario(Long idUsuario, Long idUsuarioRol, String usuario, String password, String nombre, int vigenciaFlag) {
        this.idUsuario = idUsuario;
        this.idUsuarioRol = idUsuarioRol;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.vigenciaFlag = vigenciaFlag;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuarioRol() {
        return idUsuarioRol;
    }

    public void setIdUsuarioRol(Long idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVigenciaFlag() {
        return vigenciaFlag;
    }

    public void setVigenciaFlag(int vigenciaFlag) {
        this.vigenciaFlag = vigenciaFlag;
    }

    

}
