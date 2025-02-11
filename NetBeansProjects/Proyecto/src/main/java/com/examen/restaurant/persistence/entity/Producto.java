package com.examen.restaurant.persistence.entity;

import com.examen.restaurant.persistence.DTO.PedidoDTO;
import com.examen.restaurant.persistence.DTO.ProductoDTO;
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

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<DetallesPedido> getListaDetallesPedido() {
        return listaDetallesPedido;
    }

    public void setListaDetallesPedido(List<DetallesPedido> listaDetallesPedido) {
        this.listaDetallesPedido = listaDetallesPedido;
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
    

     public ProductoDTO toDTO() {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setIdProducto(this.idProducto);
        productoDTO.setNombre(this.nombre);
        productoDTO.setDisponibilidad(this.disponibilidad);
        productoDTO.setPrecio(this.precio);
        return productoDTO;
    }

    public static Producto fromDTO(ProductoDTO productoDTO) {
        Producto producto = new Producto();
        producto.setIdProducto(productoDTO.getIdProducto());
        producto.setNombre(productoDTO.getNombre());
        producto.setDisponibilidad(productoDTO.getDisponibilidad());
        producto.setPrecio(productoDTO.getPrecio());
        return producto;
    }
    
    
    
    
    
    
    
}
