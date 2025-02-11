package com.examen.restaurant.persistence.entity;

import com.examen.restaurant.persistence.DTO.AdministradorDTO;
import com.examen.restaurant.persistence.DTO.ShowAdministradorDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;

import java.util.List;

@Entity
@Table(name = "Administrador")

public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrador;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false , unique = true)
    private String cedula;

     @Column(nullable = false , unique = true)
    private String userName;

     @Column(nullable = false , unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
    
    
    
    private  Boolean estado; 

    
    
    
    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pedido> listaPedidos = new ArrayList<>();

    public Administrador() {
    }

    public Administrador(String name, String cedula, String userName, String email, String password, Boolean estado) {
        this.name = name;
        this.cedula = cedula;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.estado = estado;
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

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    
    // DTO Administrador para mostrar 
    
    public AdministradorDTO toDTO() {
        AdministradorDTO administradorDTO = new AdministradorDTO();
        administradorDTO.setIdAdministrador(this.idAdministrador);
        administradorDTO.setName(this.name);
        administradorDTO.setCedula(this.cedula);
        administradorDTO.setUserName(this.userName);
        administradorDTO.setPassword(this.password);
        administradorDTO.setEmail(this.email);
        administradorDTO.setEstado(this.estado);
        return administradorDTO;
    }
    
    // DTO para mostrar el admionistrador 
    
    
    public ShowAdministradorDTO toShowDTO() {
        ShowAdministradorDTO showAdministradorDTO = new ShowAdministradorDTO();
        showAdministradorDTO.setIdAdministrador(this.idAdministrador);
        showAdministradorDTO.setName(this.name);
        showAdministradorDTO.setUserName(this.userName);
        showAdministradorDTO.setEmail(this.email);
        showAdministradorDTO.setEstado(this.estado);
        return showAdministradorDTO;
    }

    public static Administrador fromShowDTO(ShowAdministradorDTO showAdministradorDTO) {
        Administrador administrador = new Administrador();
        administrador.setIdAdministrador(showAdministradorDTO.getIdAdministrador());
        administrador.setName(showAdministradorDTO.getName());
        administrador.setUserName(showAdministradorDTO.getUserName());
        administrador.setEmail(showAdministradorDTO.getEmail());
        administrador.setEstado(showAdministradorDTO.getEstado());
        return administrador;
        
        
    }
    
    
    
    
}
