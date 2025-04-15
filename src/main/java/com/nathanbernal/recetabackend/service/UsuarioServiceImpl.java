package com.nathanbernal.recetabackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nathanbernal.recetabackend.model.Usuario;
import com.nathanbernal.recetabackend.repository.UsuarioRepository;

@Configuration
@Service
public class UsuarioServiceImpl implements UserDetailsService {

    Logger logger
        = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Autowired
    UsuarioRepository usuarioRepository;

    // @Override
    // public Optional<Usuario> getByUsuario(String usuario) {
    //     return usuarioRepository.findByUsuario(usuario);
    // }

    @Override
    public UserDetails loadUserByUsername(String username) {
        Usuario user = usuarioRepository.findByUsuario(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

     @Bean
    public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
    }

}
