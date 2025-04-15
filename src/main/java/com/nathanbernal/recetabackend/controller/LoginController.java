package com.nathanbernal.recetabackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nathanbernal.recetabackend.jwt.JWTAuthenticationConfig;
import com.nathanbernal.recetabackend.service.UsuarioServiceImpl;

@RestController
public class LoginController {
    @Autowired
    JWTAuthenticationConfig jwtAuthtenticationConfig;

    @Autowired
    private UsuarioServiceImpl userDetailsService;

    @PostMapping("/login")
    public String login(
            @RequestParam("user") String username,
            @RequestParam("encryptedPass") String encryptedPass) {

        /**
         * En el ejemplo no se realiza la correcta validación del usuario
         */

        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        if (!userDetails.getPassword().equals(encryptedPass)) {
            throw new RuntimeException("Invalid login");
        }

        String token = jwtAuthtenticationConfig.getJWTToken(username);

        return token;

    }
}
