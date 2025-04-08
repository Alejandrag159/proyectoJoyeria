package com.example.proyectoArquitectaturaJoyeria.Model;

public class Materiales {

    private int material_id;
    private String nombre;
    private String tipo;
    private double preciogramo;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Materiales materiales;

    public Materiales() {
    }

    public Materiales(int material_id, String nombre, String tipo, double preciogramo) {
        this.material_id = material_id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.preciogramo = preciogramo;
    }

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreciogramo() {
        return preciogramo;
    }

    public void setPreciogramo(double preciogramo) {
        this.preciogramo = preciogramo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Materiales{" +
                "material_id=" + material_id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preciogramo=" + preciogramo +
                '}';
    }

}
