
package com.examen.restaurant.persistence.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class ClienteDTO {
    

    private Long idCleinte;


    private String name;


    private String cedula;

    
    private String userName;


    private String email;

  
    private String password;
    
    
    private  Boolean estado; 

    public ClienteDTO() {
    }

    public Long getIdCleinte() {
        return idCleinte;
    }

    public void setIdCleinte(Long idCleinte) {
        this.idCleinte = idCleinte;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
    
    
    
    
}
