package com.example.proyectoArquitectaturaJoyeria.Controller;

import com.example.proyectoArquitectura.Model.Material;
import com.example.proyectoArquitectura.Services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiales")
public class MaterialesController {

    @Autowired
    private MaterialService materialService;

    @PostMapping
    public Material guardar(@RequestBody Material material) {
        return materialService.guardar(material);
    }

    @GetMapping
    public List<Material> listar() {
        return materialService.listar();
    }

    @GetMapping("/{id}")
    public Material buscarPorId(@PathVariable Integer id) {
        return materialService.buscarPorId(id);
    }

    @GetMapping("/{id}/productos")
    public List<Producto> listarProductosPorMaterial(@PathVariable Integer id) {
        return materialService.listarProductosPorMaterial(id);
    }

    @PutMapping("/{id}")
    public Material actualizar(@PathVariable Integer id, @RequestBody Material material) {
        return materialService.actualizar(id, material);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        materialService.eliminar(id);
    }
}
