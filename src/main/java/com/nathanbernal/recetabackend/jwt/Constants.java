package com.nathanbernal.recetabackend.jwt;

// manual
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Constants {

    // Spring Security
    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZATION_KEY = "Autorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT
    public static final String ISSUE_INFO = "http://www.duoc.cl ";
    public static final String SUPER_SECRET_KEY = "ASDFKFdSlka$fdas ";
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 days

    // 
    public static Key getSigningKeyB64(String secret) {

        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);

    }

    public static Key getSignKey(String secret) {

        byte[] keyBytes = secret.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);

    }

}
