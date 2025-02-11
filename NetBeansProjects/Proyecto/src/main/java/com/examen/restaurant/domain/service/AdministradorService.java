package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.AdministradorDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;

public interface AdministradorService {
    
    public AdministradorDTO crearAdministrador(AdministradorDTO administradorDTO); 
    public void desactivarAdministrador(String email); 
    public LoginDTO loginAdministrador(String email, String password);
  
}
