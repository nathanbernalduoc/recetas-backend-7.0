package com.nathanbernal.recetabackend.repository;

import com.nathanbernal.recetabackend.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>
{

    // public Optional<Usuario> findByUsuario(String usuario);
    Usuario findByUsuario(String username);

}
