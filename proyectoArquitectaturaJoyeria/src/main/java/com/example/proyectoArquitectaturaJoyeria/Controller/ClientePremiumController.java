package com.example.proyectoArquitectaturaJoyeria.Controller;
import com.example.proyectoArquitectura.Model.ClientePremium;
import com.example.proyectoArquitectura.Services.ClientePremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientespremium")
public class ClientePremiumController {

    @Autowired
    private ClientePremiumService clientePremiumService;

    @PostMapping
    public ClientePremium guardar(@RequestBody ClientePremium clientePremium) {
        return clientePremiumService.guardar(clientePremium);
    }

    @GetMapping
    public List<ClientePremium> listar() {
        return clientePremiumService.listar();
    }

    @GetMapping("/{id}")
    public ClientePremium buscarPorId(@PathVariable Integer id) {
        return clientePremiumService.buscarPorId(id);
    }

    @GetMapping("/cliente/{clienteId}")
    public ClientePremium buscarPorClienteId(@PathVariable Integer clienteId) {
        return clientePremiumService.buscarPorClienteId(clienteId);
    }

    @PutMapping("/{id}")
    public ClientePremium actualizar(@PathVariable Integer id, @RequestBody ClientePremium clientePremium) {
        return clientePremiumService.actualizar(id, clientePremium);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        clientePremiumService.eliminar(id);
    }
}
