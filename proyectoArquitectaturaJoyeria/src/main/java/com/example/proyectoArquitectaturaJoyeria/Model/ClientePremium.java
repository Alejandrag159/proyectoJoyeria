package com.example.proyectoArquitectaturaJoyeria.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class clientepremium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int cliente_id;
    private String nivel_membresia;
    private double descuento_especial;
    private String fecha_vencimiento;




    public clientepremium() {
    }

    public clientepremium(int cliente_id, String nivel_membresia, double descuento_especial, String fecha_vencimiento) {

        this.cliente_id = cliente_id;
        this.nivel_membresia = nivel_membresia;
        this.descuento_especial = descuento_especial;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public double getDescuento_especial() {
        return descuento_especial;
    }

    public void setDescuento_especial(double descuento_especial) {
        this.descuento_especial = descuento_especial;
    }

    public String getNivel_membresia() {
        return nivel_membresia;
    }

    public void setNivel_membresia(String nivel_membresia) {
        this.nivel_membresia = nivel_membresia;
    }

    @Override
    public String toString() {
        return "clientepremium{" +
                "cliente_id=" + cliente_id +
                ", nivel_membresia='" + nivel_membresia + '\'' +
                ", descuento_especial=" + descuento_especial +
                ", fecha_vencimiento='" + fecha_vencimiento + '\'' +
                '}';
    }
    @OneToMany(mappedBy = "clientespremium", cascade = CascadeType.ALL)
    private List<Clientes> cliente = new ArrayList<>();

    public void addEstudiante(Clientes clientes) {
        cliente.add(clientes);
        cliente.setClientes(this);
    }
    public void removeEstudiante(Clientes clientes) {
        clientes.remove(clientes);
        cliente.setClientes(null);
    }
    // Getter y Setter
    public List<Clientes> getClientes() {
        return clientes;
    }


}
