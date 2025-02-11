package com.examen.restaurant.web.controller;

import com.examen.restaurant.domain.service.ClienteServiceImpl;
import com.examen.restaurant.persistence.DTO.ClienteDTO;
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
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public ResponseEntity<ClienteDTO> crearCliente(@RequestBody ClienteDTO clienteDTO) {
        try {
            ClienteDTO nuevoCliente = clienteServiceImpl.crearCliente(clienteDTO);
            return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginDTO> loginCliente(@RequestParam String email, @RequestParam String password) {
        try {
            LoginDTO loginResponse = clienteServiceImpl.loginCliente(email, password);
            return new ResponseEntity<>(loginResponse, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
        }
    }

    @PutMapping("/desactivar/{email}")
    public ResponseEntity<String> desactivarCliente(@PathVariable String email) {
        try {
            clienteServiceImpl.desactivarCliente(email);
            return new ResponseEntity<>("Cliente desactivado exitosamente", HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
