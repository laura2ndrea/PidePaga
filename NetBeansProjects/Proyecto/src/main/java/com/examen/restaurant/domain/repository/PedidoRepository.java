package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.Pedido; 
import com.examen.restaurant.persistence.entity.Cliente; 
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
    List<Pedido> findByCliente(Cliente cliente); 
    
}
