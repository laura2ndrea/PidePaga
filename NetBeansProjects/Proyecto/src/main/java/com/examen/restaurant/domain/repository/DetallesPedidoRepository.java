package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.DetallesPedido;

public interface DetallesPedidoRepository extends JpaRepository<DetallesPedido, Long> {
    
}
