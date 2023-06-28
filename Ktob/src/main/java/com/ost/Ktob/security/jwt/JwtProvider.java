package com.ost.Ktob.security.jwt;

import com.ost.Ktob.security.UserPrincipal;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);
    Authentication getAuthentication(HttpServletRequest request);
    boolean validateToken(HttpServletRequest request);
}
