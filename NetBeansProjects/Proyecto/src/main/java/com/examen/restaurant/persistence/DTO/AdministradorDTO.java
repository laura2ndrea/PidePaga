
package com.examen.restaurant.persistence.DTO;

import com.examen.restaurant.persistence.entity.Administrador;


public class AdministradorDTO {
    

    private Long idAdministrador;

    private String name;

    private String cedula;

    private String userName;
    
    private  String password; 

    private String email;

    private  Boolean estado; 

    public AdministradorDTO() {
    }

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Administrador fromDTO() {
        Administrador administrador = new Administrador();
        administrador.setIdAdministrador(this.idAdministrador);
        administrador.setName(this.name);
        administrador.setCedula(this.cedula);
        administrador.setUserName(this.userName);
        administrador.setPassword(this.password);
        administrador.setEmail(this.email);
        administrador.setEstado(this.estado);
        return administrador;
    }
    
}

