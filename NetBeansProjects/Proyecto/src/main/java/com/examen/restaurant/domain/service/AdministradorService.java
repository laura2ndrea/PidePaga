package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.AdministradorDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;
import com.examen.restaurant.persistence.DTO.ShowAdministradorDTO;

public interface AdministradorService {
    
    public AdministradorDTO crearAdministrador(AdministradorDTO administradorDTO); 
    public void desactivarAdministrador(String email); 
    public LoginDTO loginAdministrador(String email, String password);
    public ShowAdministradorDTO getAdministradorByEmail(String email); 
  
}
