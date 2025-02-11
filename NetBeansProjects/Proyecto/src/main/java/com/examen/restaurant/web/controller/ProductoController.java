
package com.examen.restaurant.web.controller;

import com.examen.restaurant.domain.service.ProductoService;
import com.examen.restaurant.persistence.DTO.ProductoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")  

public class ProductoController {
    
    
    



    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    
    @GetMapping
    public ResponseEntity<List<ProductoDTO>> mostrarProductos() {
        List<ProductoDTO> productos = productoService.mostrarProductos();
        return ResponseEntity.ok(productos);  
    }

    
    @PostMapping
    public ResponseEntity<ProductoDTO> crearProducto(@RequestBody ProductoDTO productoDTO) {
        ProductoDTO createdProducto = productoService.crearProducto(productoDTO);
        return ResponseEntity.status(201).body(createdProducto);  
    }

    
    @PutMapping("/desactivar/{idProducto}")
    public ResponseEntity<Void> desactivarProducto(@PathVariable Long idProducto) {
        productoService.desactivarProducto(idProducto);
        return ResponseEntity.noContent().build();  
        
        
        
}
    

}