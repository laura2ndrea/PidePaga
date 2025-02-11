package com.examen.restaurant.persistence.entity;

import jakarta.persistence.Entity;

@Entity
public class DetallePedido {
    private Long idDetalle;
    private Integer cantidad; 
    private Producto producto; 
    private Pedido pedido; 
    
    

    public DetallePedido(Long idDetalle, Integer cantidad, Producto producto, Pedido pedido) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.producto = producto;
        this.pedido = pedido;
    }
    
    
}
