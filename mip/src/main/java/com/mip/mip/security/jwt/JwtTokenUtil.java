package com.mip.mip.security.jwt;

import com.mip.mip.model.User;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component

public class JwtTokenUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final  long EXPIRE_DURATION=24*60*60*1000;
    @Value("${app.jwt.secret}")
    private String secretKey;

    public String generatedAccessToken(User user){
        return Jwts.builder()
                .setSubject(user.getEmail() )
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
    }
    public boolean validateAcessToken(String token){
        try{
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
        }catch (ExpiredJwtException ex){
            LOGGER.error("JWT expired", ex);

        }catch (IllegalArgumentException ex){
            LOGGER.error("Tokken is null, empty or has only whitespaces", ex);
        }catch(MalformedJwtException ex){
            LOGGER.error("JWT is invalid", ex);

        }catch (UnsupportedJwtException ex){
            LOGGER.error("JWT is not suported", ex);
        }catch (SignatureException ex){
            LOGGER.error("signature validation failed", ex);
        }

        return false;

    }

    public String getSubject(String token){
        return parseClaims(token).getSubject();

    }
    private Claims parseClaims(String token){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();


    }
}