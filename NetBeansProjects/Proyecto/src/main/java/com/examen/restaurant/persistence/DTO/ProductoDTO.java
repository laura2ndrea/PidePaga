package com.examen.restaurant.persistence.DTO;




public class ProductoDTO {
    
    private Long idProducto; 
    
    
    private String nombre; 
    
    private Boolean disponibilidad; 
    
    private Double precio; 

    public ProductoDTO() {
    }

    public ProductoDTO(String nombre, Boolean disponibilidad, Double precio) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
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

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
}
