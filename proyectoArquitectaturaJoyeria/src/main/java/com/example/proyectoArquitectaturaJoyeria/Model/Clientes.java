package com.example.proyectoArquitectaturaJoyeria.Model;

import jakarta.persistence.*;

@Entity
public class Clientes {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nombre;
    private String email;
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "Cliente_id")
    private Clientes cliente;

    public Clientes() {
    }

    public Clientes(int id, String nombre, String email, String fecha, Clientes cliente) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Clientes getClientes() {
        return cliente;
    }

    public void setClientes(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fecha='" + fecha + '\'' +
                ", clientes=" + cliente +
                '}';
    }
}
