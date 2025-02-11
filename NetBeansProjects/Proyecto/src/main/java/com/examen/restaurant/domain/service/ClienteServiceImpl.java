package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.ClienteRepository;
import com.examen.restaurant.persistence.DTO.ClienteDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;
import com.examen.restaurant.persistence.entity.Cliente;
import com.examen.restaurant.security.JWTAuthtenticationConfig;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service
public class ClienteServiceImpl implements ClienteService {
    
    private final ClienteRepository clienteRepository;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    JWTAuthtenticationConfig jwtAuthtenticationConfig;
    
    @Autowired 
    public ClienteServiceImpl(ClienteRepository clienteRepository, PasswordEncoder passwordEncoder) {
        this.clienteRepository = clienteRepository; 
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public ClienteDTO crearCliente(ClienteDTO clienteDTO) {
        Cliente cliente = Cliente.fromDTO(clienteDTO);
        cliente.setEstado(true);
        Cliente clienteSave = clienteRepository.save(cliente);
        return cliente.toDTO(); 
    }

    @Override
    @Transactional
    public LoginDTO loginCliente(String email, String password) {
        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new RuntimeException("No puede estar nulo el email");
        }
        Cliente cliente = clienteRepository.findByEmail(email);
        if (cliente == null) {
            throw new RuntimeException("No se encontro el cliente: " + email);
        }
        if (passwordEncoder.matches(password, cliente.getPassword())) {
            String token = jwtAuthtenticationConfig.getJWTToken(email);
            return new LoginDTO(email, token); 
        } else {
            throw new RuntimeException("Contraseña incorrecta");
        }
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
