package com.nathanbernal.recetabackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.nathanbernal.recetabackend.jwt.Constants;
import com.nathanbernal.recetabackend.jwt.JWTAuthorizationFIlter;

@EnableWebSecurity
@Configuration
public class WebSecutiryConfig {

    @Autowired
    JWTAuthorizationFIlter jwtAuthorizationFilter;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
            .csrf( (csrf) -> csrf.disable())
            // solo ruta Login es pública
            .authorizeHttpRequests( authz -> authz
                .requestMatchers(HttpMethod.POST, Constants.LOGIN_URL).permitAll()
                .anyRequest().authenticated())
            .addFilterAfter(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();

    } 

}
