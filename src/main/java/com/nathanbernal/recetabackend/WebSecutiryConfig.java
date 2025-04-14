package com.nathanbernal.recetabackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
public class WebSecutiryConfig {

    @Autowired
    JWTAuthorizationFilter jwtAuthorizationFilter;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
            .csrf( (csrf) -> csrf.disable())
            // solo ruta Login es pública
            .authorizeHttpRequest( authz -> authz
                .requestMatchers(HttpMethod.POST, Contansts.LOGIN_URL).permitAll()
                .anyRequest().authenticated())
            .addFilterAfter(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);

        return http;

    } 

}
