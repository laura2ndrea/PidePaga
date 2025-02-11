package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.AdministradorRepository;
import com.examen.restaurant.persistence.DTO.AdministradorDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;
import com.examen.restaurant.persistence.DTO.ShowAdministradorDTO;
import com.examen.restaurant.persistence.entity.Administrador;
import com.examen.restaurant.security.JWTAuthtenticationConfig;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {
    
    private final AdministradorRepository administradorRepository; 
    private final PasswordEncoder passwordEncoder;
    @Autowired
    JWTAuthtenticationConfig jwtAuthtenticationConfig;
    
    @Autowired
    public AdministradorServiceImpl(AdministradorRepository administradorRepository, PasswordEncoder passwordEncoder) {
        this.administradorRepository = administradorRepository; 
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public AdministradorDTO crearAdministrador(AdministradorDTO administradorDTO) {
        Administrador administrador = administradorDTO.fromDTO(); 
        administrador.setEstado(true);
        administrador.setPassword(passwordEncoder.encode(administradorDTO.getPassword()));
        Administrador administradorSave = administradorRepository.save(administrador); 
        return administrador.toDTO(); 
    }

    @Override
    @Transactional
    public void desactivarAdministrador(String email) {
        Administrador administrador = administradorRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public LoginDTO loginAdministrador(String email, String password) {
        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new RuntimeException("No puede estar nulo el email");
        }
        Administrador administrador = administradorRepository.findByEmail(email);
        if (administrador == null) {
            throw new RuntimeException("No se encontro el administrador: " + email);
        }
        if (passwordEncoder.matches(password, administrador.getPassword())) {
            String token = jwtAuthtenticationConfig.getJWTToken(email);
            return new LoginDTO(email, token); 
        } else {
            throw new RuntimeException("Contraseña incorrecta");
        }
    }
    
    @Override
    @Transactional
    public ShowAdministradorDTO getAdministradorByEmail(String email) {
        Administrador administrador = administradorRepository.findByEmail(email); 
        return administrador.toShowDTO(); 
    }
    
}
