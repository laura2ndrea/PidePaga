package com.examen.restaurant.persistence.DTO;

public class DetallesPedidoDTO {

    private Long DetallesPedido;
    private String nombreProducto;
    private Integer cantidadProducto;

    public DetallesPedidoDTO() {
    }

    public Long getDetallesPedido() {
        return DetallesPedido;
    }

    public void setDetallesPedido(Long DetallesPedido) {
        this.DetallesPedido = DetallesPedido;
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
