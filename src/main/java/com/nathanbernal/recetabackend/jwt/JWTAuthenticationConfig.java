package com.nathanbernal.recetabackend.jwt;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

//import com.nathanbernal.recetabackend.jwt.Constants;

@Configuration
public class JWTAuthenticationConfig {

    JWTAuthenticationConfig () {}

    public String getJWTToken(String username) {
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
            .commaSeparatedStringToAuthorityList("ROLE_USER");

        Map<String, Object> claims = new HashMap<>();
        claims.put("authorities", grantedAuthorities.stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.toList()));

        String token = Jwts.builder()
            .claims()
            .add(claims)
            .subject(username)
            .issuedAt(new Date(System.currentTimeMillis()))
            .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 1440))
            .and()
            .signWith(getSigningKey(Constants.SUPER_SECRET_KEY))
            .compact();

        return "Bearer " + token;

    }

    public Key getSigningKey(String k) {
        byte[] keyBytes = Decoders.BASE64.decode(k);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}