package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.ProductoRepository;
import com.examen.restaurant.persistence.DTO.ProductoDTO;
import com.examen.restaurant.persistence.entity.Producto;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    
    
    
    
    @Override
    public List<ProductoDTO> mostrarProductos() {
        
        
         List<Producto> productos = productoRepository.findAll();
         List<ProductoDTO> listaProductoDTO = new ArrayList<>();
       
         for (Producto element : productos){
             listaProductoDTO.add(element.toDTO());
         }
        
     return listaProductoDTO;
    }

    
    
@Override
public ProductoDTO crearProducto(ProductoDTO productoDTO) {
    Producto producto = Producto.fromDTO(productoDTO);
    Producto savedProducto = productoRepository.save(producto);
    return savedProducto.toDTO();
    
}

    
    

    @Override
    public void desactivarProducto(Long idProducto) {
   
        Producto producto = productoRepository.findById(idProducto)
                                              .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        
        producto.setDisponibilidad(false);  
        productoRepository.save(producto);
    }
}
