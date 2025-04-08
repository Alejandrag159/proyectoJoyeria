package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectura.Model.Categoria;
import com.example.proyectoArquitectura.Model.Producto;
import com.example.proyectoArquitectura.Repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServices {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    public List<Producto> listarProductosPorCategoria(int categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
        return categoria.getProductos();
    }
}
