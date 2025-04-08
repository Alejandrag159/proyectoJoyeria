package com.example.proyectoArquitectaturaJoyeria.Controller;

import com.example.proyectoArquitectura.Model.Producto;
import com.example.proyectoArquitectura.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    @GetMapping
    public List<Producto> listar() {
        return productoService.listar();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable Integer id) {
        return productoService.buscarPorId(id);
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> listarPorCategoria(@PathVariable Integer categoriaId) {
        return productoService.listarPorCategoria(categoriaId);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Integer id, @RequestBody Producto producto) {
        return productoService.actualizar(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        productoService.eliminar(id);
    }
}
