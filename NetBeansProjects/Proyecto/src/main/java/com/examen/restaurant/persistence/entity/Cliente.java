package com.examen.restaurant.persistence.entity;

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
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdministrador;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cedula;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pedido> listaPedidos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String name, String cedula, String userName, String email, String password) {
        this.name = name;
        this.cedula = cedula;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Cliente(Long idAdministrador, String name, String cedula, String userName, String email, String password) {
        this.idAdministrador = idAdministrador;
        this.name = name;
        this.cedula = cedula;
        this.userName = userName;
        this.email = email;
        this.password = password;
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

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    
//    public void addPedido(Pedido pedido) {
//        this.listaPedidos.add(pedido);
//        setFollower(this);
//    }
//
//    public void removeFollower(Follow follow) {
//        this.followerList.remove(follow);
//        follow.setFollower(null);
//    }
//    
    
    
    
    
}
