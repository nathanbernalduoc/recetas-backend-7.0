package com.nathanbernal.recetabackend.service;

import java.util.Optional;
import com.nathanbernal.recetabackend.model.Usuario;

public interface UsuarioService {

    Optional<Usuario> getByUsuario(String usuario);

}
