package com.examen.restaurant.persistence.DTO;

public class DetallesPedidoDTO {

    private Long idDetallesPedido;
    private String nombreProducto;
    private Integer cantidadProducto;

    public DetallesPedidoDTO() {
    }

    
    
    
    public Long getIdDetallesPedido() {
        return idDetallesPedido;
    }

    
    public void setIdDetallesPedido(Long idDetallesPedido) {
        this.idDetallesPedido = idDetallesPedido;
    }

   

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

}
