package com.examen.restaurant.persistence.entity;

import com.examen.restaurant.persistence.DTO.ClienteDTO;
import com.examen.restaurant.persistence.DTO.ShowClienteDTO;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCleinte;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false , unique = true)
    private String cedula;

    @Column(nullable = false , unique = true)
    private String userName;

     @Column(nullable = false , unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
    
    
    private  Boolean estado; 

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pedido> listaPedidos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String name, String cedula, String userName, String email, String password) {
        this.name = name;
        this.cedula = cedula;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Cliente(Long idCleinte, String name, String cedula, String userName, String email, String password, Boolean estado) {
        this.idCleinte = idCleinte;
        this.name = name;
        this.cedula = cedula;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.estado = estado;
    }

    public Long getIdCleinte() {
        return idCleinte;
    }

    public void setIdCleinte(Long idCleinte) {
        this.idCleinte = idCleinte;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
    
    
    
 // DTO CLIENTE DTO 

    public ClienteDTO toDTO() {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setIdCleinte(this.idCleinte);
        clienteDTO.setName(this.name);
        clienteDTO.setCedula(this.cedula);
        clienteDTO.setUserName(this.userName);
        clienteDTO.setEmail(this.email);
        clienteDTO.setPassword(this.password);
        clienteDTO.setEstado(this.estado);
        return clienteDTO;
    }

    public static Cliente fromDTO(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setIdCleinte(clienteDTO.getIdCleinte());
        cliente.setName(clienteDTO.getName());
        cliente.setCedula(clienteDTO.getCedula());
        cliente.setUserName(clienteDTO.getUserName());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setPassword(clienteDTO.getPassword());
        cliente.setEstado(clienteDTO.getEstado());
        return cliente;
    }
    
    
    
    
    /// DTO SOW DTO 
    
    public ShowClienteDTO toShowDTO() {
        ShowClienteDTO showClienteDTO = new ShowClienteDTO();
        showClienteDTO.setIdCliente(this.idCleinte);
        showClienteDTO.setName(this.name);
        showClienteDTO.setUserName(this.userName);
        showClienteDTO.setEmail(this.email);
        showClienteDTO.setEstado(this.estado);
        return showClienteDTO;
    }

    public static Cliente fromShowDTO(ShowClienteDTO showClienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setIdCleinte(showClienteDTO.getIdCliente());
        cliente.setName(showClienteDTO.getName());
        cliente.setUserName(showClienteDTO.getUserName());
        cliente.setEmail(showClienteDTO.getEmail());
        cliente.setEstado(showClienteDTO.getEstado());
        // No es necesario establecer la contraseña ni la cédula en el ShowClienteDTO
        return cliente;
    }

    
    
}

  
    
    
    

