package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectura.Model.Material;
import com.example.proyectoArquitectura.Model.ProductoMaterial;
import com.example.proyectoArquitectura.Repository.MaterialRepository;
import com.example.proyectoArquitectura.Repository.ProductoMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServices {

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private ProductoMaterialRepository productoMaterialRepository;

    public Material guardar(Material material) {
        return materialRepository.save(material);
    }

    public List<Material> listarTodos() {
        return materialRepository.findAll();
    }

    public List<ProductoMaterial> listarProductosPorMaterial(int materialId) {
        return productoMaterialRepository.findByMaterialId(materialId);
    }
}
