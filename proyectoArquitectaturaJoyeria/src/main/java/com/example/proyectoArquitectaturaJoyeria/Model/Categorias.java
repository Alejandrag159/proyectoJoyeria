package com.example.proyectoArquitecturaJoyeria.Model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ClientePremium {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nivel_membresia;
    private double descuento_especial;
    private String fecha_vencimiento;

    @OneToMany(mappedBy = "clientePremium", cascade = CascadeType.ALL)
    private List<Clientes> clientes = new ArrayList<>();

    // Constructors, getters, setters
    public ClientePremium() {
    }

    public ClientePremium(int id, String nivel_membresia, double descuento_especial, String fecha_vencimiento) {
        this.id = id;
        this.nivel_membresia = nivel_membresia;
        this.descuento_especial = descuento_especial;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel_membresia() {
        return nivel_membresia;
    }

    public void setNivel_membresia(String nivel_membresia) {
        this.nivel_membresia = nivel_membresia;
    }

    public double getDescuento_especial() {
        return descuento_especial;
    }

    public void setDescuento_especial(double descuento_especial) {
        this.descuento_especial = descuento_especial;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public List<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Clientes cliente) {
        clientes.add(cliente);
        cliente.setClientePremium(this);
    }

    public void removeCliente(Clientes cliente) {
        clientes.remove(cliente);
        cliente.setClientePremium(null);
    }

    @Override
    public String toString() {
        return "ClientePremium{" +
                "id=" + id +
                ", nivel_membresia='" + nivel_membresia + '\'' +
                ", descuento_especial=" + descuento_especial +
                ", fecha_vencimiento='" + fecha_vencimiento + '\'' +
                '}';
    }
}
