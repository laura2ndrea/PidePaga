package com.examen.restaurant.domain.service;

import com.examen.restaurant.domain.repository.PedidoRepository;
import com.examen.restaurant.persistence.DTO.PedidoDTO;
import com.examen.restaurant.persistence.entity.Pedido;
import com.examen.restaurant.persistence.entity.EstadoPedido;
import com.examen.restaurant.persistence.entity.Cliente;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PedidoServiceImpl implements PedidoService {
    
    private final PedidoRepository pedidoRepository; 
    private final EstadoPedidoServiceImpl estadoPedidoServiceImpl; 
    private final ClienteServiceImpl clienteServiceImpl; 
    
    @Autowired 
    public PedidoServiceImpl(PedidoRepository pedidoRepository, EstadoPedidoServiceImpl estadoPedidoServiceImpl, ClienteServiceImpl clienteServiceImpl) {
        this.pedidoRepository = pedidoRepository; 
        this.estadoPedidoServiceImpl = estadoPedidoServiceImpl; 
        this.clienteServiceImpl = clienteServiceImpl; 
    }

//    private String estado;
//    private Date fechaPedido;
//    private Integer total;
//    private List<DetallesPedidoDTO> listaDetallesPedidoDTO;
//    private String nombreCliente;
//    private String emailCliente; 
//    private String administrradorNombre;
//    private String administradorEmial;
    
    @Override
    public PedidoDTO crearPedido(PedidoDTO pedidoDTO) {
        EstadoPedido estado = estadoPedidoServiceImpl.getEstadoPedidoByNombre(pedidoDTO.getEstado()); 
        Pedido pedido = new Pedido();
        pedido.setIdpedido(pedidoDTO.getIdpedido());
        pedido.setIdpedido(pedidoDTO.getIdpedido());
        pedido.setIdpedido(pedidoDTO.getIdpedido());
        pedido.setIdpedido(pedidoDTO.getIdpedido());
        pedido.setFecha(new Date());
        Pedido pedidoSave = pedidoRepository.save(pedido); 
        return pedidoSave.toDTO();
        
    }

    @Override
    public PedidoDTO cambiarEstado(Long idPedido, Long idEstado) {
        Pedido pedido = pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new RuntimeException("Not found")); 
        EstadoPedido estadoPedido = estadoPedidoServiceImpl.getEstadoPedidoById(idEstado); 
        pedido.setEstado(estadoPedido); 
        Pedido pedidoSave = pedidoRepository.save(pedido); 
        return pedidoSave.toDTO();
    }

    @Override
    public List<PedidoDTO> getPedidosByCliente(String emailCliente) {
        Cliente cliente = clienteServiceImpl.getClienteByEmail(emailCliente); 
        List<Pedido> pedidos = pedidoRepository.findByCliente(cliente); 
        return pedidos.stream()
                .map(p -> p.toDTO())
                .collect(Collectors.toList());
    }
    
    public Pedido getPedidoById(Long idPedido) {
        return pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }
    
}
