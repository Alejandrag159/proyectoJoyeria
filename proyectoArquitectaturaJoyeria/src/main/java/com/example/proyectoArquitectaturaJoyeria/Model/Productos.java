package com.example.proyectoArquitectaturaJoyeria.Model;

@Entity
public class Productos {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private int producto_id ;
    private String nombre;
    private String precio ;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categorias;

    public Productos() {
    }

    public Productos(int producto_id, String nombre, String precio, int stock) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Productos{" +
                "producto_id=" + producto_id +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", stock=" + stock +
                '}';
    }
}
