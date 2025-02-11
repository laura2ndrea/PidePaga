package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.PedidoDTO;

public interface PedidoService {
    
    public PedidoDTO crearPedido(PedidoDTO pedidoDTO); 
    public PedidoDTO cambiarEstado(Long idPedido, Long idEstado); 
    
}
