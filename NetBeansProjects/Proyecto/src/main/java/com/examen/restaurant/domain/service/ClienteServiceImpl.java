package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.ClienteRepository;
import com.examen.restaurant.persistence.DTO.ClienteDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;
import com.examen.restaurant.persistence.entity.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    private final ClienteRepository clienteRepository;
    
    @Autowired 
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository; 
    }

    @Override
    @Transactional
    public ClienteDTO crearCliente(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional
    public LoginDTO loginCliente(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @Transactional
    public void desactivarCliente(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Cliente getClienteByEmail (String emailCliente) {
        return clienteRepository.findByEmail(emailCliente); 
    }
    
}
