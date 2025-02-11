package com.examen.restaurant.persistence.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginDTO {
    
    @JsonIgnore
    private String email;
    private String token;
    
    public LoginDTO() {
    }

    public LoginDTO(String user, String token) {
        this.email = user;
        this.token = token;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
