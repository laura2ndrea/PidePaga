package com.examen.restaurant.persistence.entity;

import com.examen.restaurant.persistence.DTO.PedidoDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;



@Entity
@Table(name = "Producto")
public class Producto {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto; 
    
    
    private String nombre; 
    
    private Boolean disponibilidad; 
    
    private Double precio; 
    
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetallesPedido> listaDetallesPedido;

    public Producto() {
    }
    

    public Producto(Long idProducto, String nombre, Double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    

    
    
    
    
    
    
//    
//      public CreateUserDTO toDTOCreate() {
//        CreateUserDTO createUserDTO = new CreateUserDTO();
//        createUserDTO.setName(this.name);
//        createUserDTO.setEmail(this.email);
//        createUserDTO.setPassword(this.password);
//        createUserDTO.setUserName(this.userName);
//        return createUserDTO;
//
//    }
//    
    
    
}
