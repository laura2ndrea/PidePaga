
package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class DetallesPedidoServiceImpl implements DetallesPedidoService {
    
    private final PedidoServiceImpl pedidoServiceImpl; 
    
    @Autowired
    public DetallesPedidoServiceImpl(PedidoServiceImpl pedidoServiceImpl) {
        this.pedidoServiceImpl = pedidoServiceImpl; 
    }

    @Override
    public PedidoDTO agregarDetallePedido(Long idPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //Pedido pedido = pedidoServiceImpl.
    }

    @Override
    public PedidoDTO modificarDetallePedido(Long idPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PedidoDTO eliminarDetallePedido(Long idPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
