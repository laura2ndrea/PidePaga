package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.ClienteDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;

public interface ClienteService {
    
    public ClienteDTO crearCliente(ClienteDTO clienteDTO); 
    public LoginDTO loginCliente(String email, String password);
    public void desactivarCliente(String email); 
   
}
