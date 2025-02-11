package com.examen.restaurant.domain.service;

import com.examen.restaurant.persistence.DTO.ProductoDTO;
import java.util.List;

public interface ProductoService {
    
    public List<ProductoDTO> mostrarProductos(); 
    public ProductoDTO crearProducto(ProductoDTO productoDTO);
    public void desactivarProducto(Long idProducto);
    //Editar producto 
}
