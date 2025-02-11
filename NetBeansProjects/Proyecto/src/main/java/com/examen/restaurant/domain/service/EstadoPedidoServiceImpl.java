package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.EstadoPedidoRepository;
import com.examen.restaurant.persistence.entity.EstadoPedido;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoPedidoServiceImpl implements EstadoPedidoService{
    
    private final EstadoPedidoRepository estadoPedidoRepository; 
    
    @Autowired
    public EstadoPedidoServiceImpl(EstadoPedidoRepository estadoPedidoRepository) {
        this.estadoPedidoRepository = estadoPedidoRepository; 
    }

    @Override
    @Transactional
    public EstadoPedido getEstadoPedidoById(Long idEstadoPedido) {
        return estadoPedidoRepository.findById(idEstadoPedido)
                .orElseThrow(() -> new RuntimeException("Not found")); 
    }
    
    public EstadoPedido getEstadoPedidoByNombre(String nombre) {
        return estadoPedidoRepository.findByNombre(nombre);
    }
    
}
