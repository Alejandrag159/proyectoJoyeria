package com.example.proyectoArquitectaturaJoyeria.Model;

@Entity
public class Categorias {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    // tambien lo pueden dejar en tipo Long
    private int categoria_id ;
    private String nombre;
    private String descripcion;



    @OneToMany(mappedBy = "productos_materiales", cascade = CascadeType.ALL)
    private List<Productos_Materiales> productos_material = new ArrayList<>();

    public void addProductos(Productos_Materiales productos_materiales) {
        productos_material.add(productos_materiales);
        productos_material.setMateriales(this);
    }
    public void removeProductos(Productos_Materiales productos_materiales) {
        productos_material.remove(productos_materiales);
        productos_material.setMateriales(null);
    }
    // Getter y Setter
    public List<Productos_Materiales> getMateriales() {
        return productos_material;
    }
}

}
