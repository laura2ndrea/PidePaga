package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
