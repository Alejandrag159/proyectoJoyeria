package com.example.proyectoArquitectaturaJoyeria.Controller;


import com.example.proyectoArquitectura.Model.ProductoMaterial;
import com.example.proyectoArquitectura.Services.ProductoMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos-materiales")
public class ProductoMaterialController {

    @Autowired
    private ProductoMaterialService productoMaterialService;

    @PostMapping
    public ProductoMaterial agregarMaterialAProducto(
            @RequestParam Integer productoId,
            @RequestParam Integer materialId,
            @RequestParam double cantidad) {
        return productoMaterialService.agregarMaterialAProducto(productoId, materialId, cantidad);
    }

    @DeleteMapping
    public void eliminarMaterialDeProducto(
            @RequestParam Integer productoId,
            @RequestParam Integer materialId) {
        productoMaterialService.eliminarMaterialDeProducto(productoId, materialId);
    }

    @PutMapping("/cantidad")
    public ProductoMaterial actualizarCantidadMaterial(
            @RequestParam Integer productoId,
            @RequestParam Integer materialId,
            @RequestParam double nuevaCantidad) {
        return productoMaterialService.actualizarCantidadMaterial(productoId, materialId, nuevaCantidad);
    }
}

