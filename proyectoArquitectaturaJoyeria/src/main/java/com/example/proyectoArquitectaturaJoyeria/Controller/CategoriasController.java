package com.example.proyectoArquitecturaJoyeria.Controller;

import com.example.proyectoArquitecturaJoyeria.Model.Categorias;
import com.example.proyectoArquitecturaJoyeria.Model.Productos;
import com.example.proyectoArquitecturaJoyeria.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categorias guardar(@RequestBody Categorias categoria) {
        return categoriaService.guardar(categoria);
    }

    @GetMapping
    public List<Categorias> listar() {
        return categoriaService.listar();
    }

    @GetMapping("/{id}")
    public Categorias buscarPorId(@PathVariable Integer id) {
        return categoriaService.buscarPorId(id);
    }

    @GetMapping("/{id}/productos")
    public List<Productos> listarProductosPorCategoria(@PathVariable Integer id) {
        return categoriaService.listarProductosPorCategoria(id);
    }

    @PutMapping("/{id}")
    public Categorias actualizar(@PathVariable Integer id, @RequestBody Categorias categoria) {
        return categoriaService.actualizar(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }
}