package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectura.Model.Cliente;
import com.example.proyectoArquitectura.Model.ClientePremium;
import com.example.proyectoArquitectura.Repository.ClientePremiumRepository;
import com.example.proyectoArquitectura.Repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClientePremiumRepository clientePremiumRepository;

    @Transactional
    public Cliente guardarCliente(Cliente cliente, int premiumId) {
        ClientePremium premium = clientePremiumRepository.findById(premiumId)
                .orElseThrow(() -> new RuntimeException("Información premium no encontrada"));

        cliente.setClientePremium(premium);
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public List<Cliente> listarPorPremium(int premiumId) {
        return clienteRepository.findByClientePremiumId(premiumId);
    }
}