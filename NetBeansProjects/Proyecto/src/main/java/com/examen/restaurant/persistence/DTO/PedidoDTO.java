package com.examen.restaurant.persistence.DTO;

import com.examen.restaurant.persistence.entity.Pedido;
import java.util.Date;
import java.util.List;

public class PedidoDTO {

    private Long idpedido;
    private String estado;
    private Date fechaPedido;
    private Integer total;
    private List<DetallesPedidoDTO> listaDetallesPedidoDTO;
    private String nombreCliente;
    private String emailCliente; 
    private String administrradorNombre;
    private String administradorEmial;
    
    

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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getAdministrradorNombre() {
        return administrradorNombre;
    }

    public void setAdministrradorNombre(String administrradorNombre) {
        this.administrradorNombre = administrradorNombre;
    }

    public String getAdministradorEmial() {
        return administradorEmial;
    }

    public void setAdministradorEmial(String administradorEmial) {
        this.administradorEmial = administradorEmial;
    }
    
}
