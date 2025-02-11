package com.examen.restaurant.persistence.entity;

import com.examen.restaurant.persistence.DTO.DetallesPedidoDTO;
import com.examen.restaurant.persistence.DTO.PedidoDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpedido;

    @ManyToOne
    @JoinColumn(name = "idAdministrador ")
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "idCleinte ")
    private Cliente cliente;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetallesPedido> ListaDEtallesPedido;

    @ManyToOne
    @JoinColumn(name = "idestado")
    private EstadoPedido estado;

    private Integer Total;

    public Pedido() {
    }

    public Pedido(Administrador administrador, Cliente cliente, Date fecha, List<DetallesPedido> ListaDEtallesPedido) {
        this.administrador = administrador;
        this.cliente = cliente;
        this.fecha = fecha;
        this.ListaDEtallesPedido = ListaDEtallesPedido;
    }

    public Pedido(Long idpedido, Administrador administrador, Cliente cliente, Date fecha, List<DetallesPedido> ListaDEtallesPedido) {
        this.idpedido = idpedido;
        this.administrador = administrador;
        this.cliente = cliente;
        this.fecha = fecha;
        this.ListaDEtallesPedido = ListaDEtallesPedido;
    }

    public Long getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Long idpedido) {
        this.idpedido = idpedido;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetallesPedido> getListaDEtallesPedido() {
        return ListaDEtallesPedido;
    }

    public void setListaDEtallesPedido(List<DetallesPedido> ListaDEtallesPedido) {
        this.ListaDEtallesPedido = ListaDEtallesPedido;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    public PedidoDTO toDTO() {

        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setEstado(this.estado.getNombre());
        pedidoDTO.setFechaPedido(this.fecha);
        pedidoDTO.setIdpedido(this.idpedido);
        pedidoDTO.setTotal(this.Total);
        List<DetallesPedidoDTO> listaDetalelsDTO = new ArrayList<>();
        for (DetallesPedido element : this.getListaDEtallesPedido()) {
            listaDetalelsDTO.add(element.toDTO());

        }
        pedidoDTO.setListaDetallesPedidoDTO(listaDetalelsDTO);
        pedidoDTO.setAdministradorEmial(this.getAdministrador().getEmail());
        pedidoDTO.setAdministrradorNombre(this.administrador.getName());
        pedidoDTO.setEmailCliente(this.cliente.getEmail());
        pedidoDTO.setNombreCliente(this.getCliente().getName());
        return pedidoDTO;

    }

    
    public Pedido fromDTO(PedidoDTO pedidoDTO) {
    Pedido pedido = new Pedido();
    pedido.setIdpedido(pedidoDTO.getIdpedido());
    pedido.setFecha(pedidoDTO.getFechaPedido());
    pedido.setTotal(pedidoDTO.getTotal());

    // Asignar el estado del pedido
    EstadoPedido estadoPedido = new EstadoPedido(); // Suponemos que creas el objeto estado de alguna forma
    estadoPedido.setNombre(pedidoDTO.getEstado());
    pedido.setEstado(estadoPedido);

  
    List<DetallesPedido> listaDetalles = new ArrayList<>();
    for (DetallesPedidoDTO detallesDTO : pedidoDTO.getListaDetallesPedidoDTO()) {
        DetallesPedido detallesPedido = DetallesPedido.fromDTO(detallesDTO);
        listaDetalles.add(detallesPedido);
    }
    pedido.setListaDEtallesPedido(listaDetalles);

    
    Cliente cliente = new Cliente(); 
    cliente.setEmail(pedidoDTO.getEmailCliente());
    cliente.setName(pedidoDTO.getNombreCliente());
    pedido.setCliente(cliente);

  
    Administrador administrador = new Administrador(); 
    administrador.setEmail(pedidoDTO.getAdministradorEmial());
    administrador.setName(pedidoDTO.getAdministrradorNombre());
    pedido.setAdministrador(administrador);

    return pedido;
}

    
    
    
}
