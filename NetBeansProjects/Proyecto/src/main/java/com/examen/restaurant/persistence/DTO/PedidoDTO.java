package com.examen.restaurant.persistence.DTO;

import java.util.Date;
import java.util.List;

public class PedidoDTO {

    private Long idpedido;
    private String estado;
    private Date fechaPedido;
    private Integer total;
    private List<DetallesPedidoDTO> listaDetallesPedidoDTO;

    public PedidoDTO() {
    }

    public Long getIdpedido() {
        return idpedido;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    
    
    
    public void setIdpedido(Long idpedido) {
        this.idpedido = idpedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<DetallesPedidoDTO> getListaDetallesPedidoDTO() {
        return listaDetallesPedidoDTO;
    }

    public void setListaDetallesPedidoDTO(List<DetallesPedidoDTO> listaDetallesPedidoDTO) {
        this.listaDetallesPedidoDTO = listaDetallesPedidoDTO;
    }

     
    
    
    
    
    
}
