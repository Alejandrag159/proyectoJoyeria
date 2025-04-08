package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectura.Model.Categoria;
import com.example.proyectoArquitectura.Model.Producto;
import com.example.proyectoArquitectura.Repository.CategoriaRepository;
import com.example.proyectoArquitectura.Repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServices {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public Producto guardarProducto(Producto producto, int categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        producto.setCategoria(categoria);
        return productoRepository.save(producto);
    }

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    public List<Producto> listarPorCategoria(int categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }
}