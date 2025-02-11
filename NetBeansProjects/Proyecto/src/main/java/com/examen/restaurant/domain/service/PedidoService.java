package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.PedidoDTO;
import java.util.List;

public interface PedidoService {
    
    public PedidoDTO crearPedido(PedidoDTO pedidoDTO); 
    public PedidoDTO cambiarEstado(Long idPedido, Long idEstado); 
    public List<PedidoDTO> getPedidosByCliente (String emailCliente); 
    
}
