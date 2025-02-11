package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.EstadoPedido;

public interface EstadoPedidoRepository extends JpaRepository<EstadoPedido, Long> {
    
}
