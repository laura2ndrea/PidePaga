

package com.examen.restaurant.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "EstadoPedido")
public class EstadoPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado; 
    
    @Column(nullable = false , unique = true)
    private String nombre; 

    public EstadoPedido() {
    }

    public EstadoPedido(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
