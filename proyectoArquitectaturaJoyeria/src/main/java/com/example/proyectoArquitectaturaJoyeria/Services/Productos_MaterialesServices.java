package com.example.proyectoArquitectaturaJoyeria.Services;


import com.example.proyectoArquitectura.Model.Material;
import com.example.proyectoArquitectura.Model.Producto;
import com.example.proyectoArquitectura.Model.ProductoMaterial;
import com.example.proyectoArquitectura.Repository.ProductoMaterialRepository;
import com.example.proyectoArquitectura.Repository.ProductoRepository;
import com.example.proyectoArquitectura.Repository.MaterialRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoMaterialServices {

    @Autowired
    private ProductoMaterialRepository productoMaterialRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private MaterialRepository materialRepository;

    @Transactional
    public ProductoMaterial agregarMaterialAProducto(int productoId, int materialId, double cantidad) {
        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        Material material = materialRepository.findById(materialId)
                .orElseThrow(() -> new RuntimeException("Material no encontrado"));

        ProductoMaterial productoMaterial = new ProductoMaterial();
        productoMaterial.setProducto(producto);
        productoMaterial.setMaterial(material);
        productoMaterial.setCantidadUtilizada(cantidad);

        return productoMaterialRepository.save(productoMaterial);
    }
}