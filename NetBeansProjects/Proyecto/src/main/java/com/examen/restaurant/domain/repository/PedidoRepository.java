package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.Pedido; 

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
    
}
