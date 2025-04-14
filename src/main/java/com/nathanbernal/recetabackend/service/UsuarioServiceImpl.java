package com.nathanbernal.recetabackend.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.nathanbernal.recetabackend.model.Usuario;
import com.nathanbernal.recetabackend.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByUsuario(String usuario) {
        return usuarioRepository.findByUsuario(usuario);
    }

}
