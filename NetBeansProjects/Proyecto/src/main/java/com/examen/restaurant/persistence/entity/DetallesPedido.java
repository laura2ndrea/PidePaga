
package com.examen.restaurant.persistence.entity;


import com.examen.restaurant.persistence.DTO.DetallesPedidoDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;




@Entity
@Table(name = "DetallesPedido")
public class DetallesPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDEtallesPedido;
    
    
    private Integer cantidad; 
  
     
    
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    
    
    public DetallesPedido() {
    }

    public DetallesPedido(Integer cantidad, Pedido pedido, Producto producto) {
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.producto = producto;
    }

    public Long getIdDEtallesPedido() {
        return idDEtallesPedido;
    }

    public void setIdDEtallesPedido(Long idDEtallesPedido) {
        this.idDEtallesPedido = idDEtallesPedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

   
    
     public DetallesPedidoDTO toDTO() {
        DetallesPedidoDTO detallesPedidoDTO = new DetallesPedidoDTO();
        detallesPedidoDTO.setIdDetallesPedido(this.idDEtallesPedido);
        detallesPedidoDTO.setNombreProducto(this.producto.getNombre());
        detallesPedidoDTO.setCantidadProducto(this.cantidad);
        return detallesPedidoDTO;
    }


     public  static DetallesPedido fromDTO(DetallesPedidoDTO detallesPedidoDTO) {
    DetallesPedido detallesPedido = new DetallesPedido();
    detallesPedido.setIdDEtallesPedido(detallesPedidoDTO.getIdDetallesPedido());
    detallesPedido.setProducto(new Producto()); // Asumimos que el Producto se asignará de alguna forma
    detallesPedido.getProducto().setNombre(detallesPedidoDTO.getNombreProducto());
    detallesPedido.setCantidad(detallesPedidoDTO.getCantidadProducto());
    return detallesPedido;
}


    
    
    
}
