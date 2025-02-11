package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
