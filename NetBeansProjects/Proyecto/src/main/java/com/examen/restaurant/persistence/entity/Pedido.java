package com.examen.restaurant.persistence.entity;

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
    
    
    
    
//    
//    public PedidoDTO toDTO (){
//        
//        PedidoDTO pedidoDTO = new PedidoDTO();
//        pedidoDTO.setEstado(this.estado.getNombre());
//        pedidoDTO.setFechaPedido(this.fecha);
//        pedidoDTO.setIdpedido(this.idpedido);
//        pedidoDTO.setTotal(this.Total);
//        for(DetallesPedido element : this.getListaDEtallesPedido())
//        
//        
//        
//        
//    }
    
    
    
    
    
    
    
}
