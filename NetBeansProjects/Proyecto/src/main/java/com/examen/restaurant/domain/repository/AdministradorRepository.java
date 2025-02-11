package com.examen.restaurant.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examen.restaurant.persistence.entity.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador,Long>  {
    
    Administrador findByEmail(String email); 
}
