package com.examen.restaurant.web.controller;

import com.examen.restaurant.domain.service.AdministradorServiceImpl;
import com.examen.restaurant.persistence.DTO.AdministradorDTO;
import com.examen.restaurant.persistence.DTO.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admins")
public class AdministradorController {
   
    @Autowired
    private AdministradorServiceImpl administradorServiceImpl;

    @PostMapping("/crear")
    public ResponseEntity<AdministradorDTO> crearAdministrador(@RequestBody AdministradorDTO administradorDTO) {
        try {
            AdministradorDTO creado = administradorServiceImpl.crearAdministrador(administradorDTO);
            return new ResponseEntity<>(creado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/desactivar/{email}")
    public ResponseEntity<Void> desactivarAdministrador(@PathVariable String email) {
        try {
            administradorServiceImpl.desactivarAdministrador(email);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);  
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);  
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginDTO> loginAdministrador(@RequestParam String email, @RequestParam String password) {
        try {
            LoginDTO loginDTO = administradorServiceImpl.loginAdministrador(email, password);
            return new ResponseEntity<>(loginDTO, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);  // 401 Unauthorized si hay algún error de login
        }
    }
    
    //@PutMaping("/update/email")

}
