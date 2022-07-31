package com.mip.mip.security;

public class AuthResponse {
    private String email;
    private String accesToken;

    public AuthResponse() {
    }

    public AuthResponse(String email, String accessToken) {
        this.email = email;
        this.accesToken = accessToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accesToken;
    }

    public void setAccessToken(String accessToken) {
        this.accesToken = accessToken;
    }

}
