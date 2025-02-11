package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.PedidoDTO;

public interface DetallesPedidoService {
    
    public PedidoDTO agregarDetallePedido(Long idPedido); 
    public PedidoDTO modificarDetallePedido(Long idPedido); 
    public PedidoDTO eliminarDetallePedido(Long idPedido); 
    
}
