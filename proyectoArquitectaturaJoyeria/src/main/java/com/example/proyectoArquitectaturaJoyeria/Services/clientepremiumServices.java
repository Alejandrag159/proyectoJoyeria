package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectura.Model.ClientePremium;
import com.example.proyectoArquitectura.Repository.ClientePremiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientePremiumServices {

    @Autowired
    private ClientePremiumRepository clientePremiumRepository;

    public ClientePremium guardar(ClientePremium clientePremium) {
        return clientePremiumRepository.save(clientePremium);
    }

    public List<ClientePremium> listarTodos() {
        return clientePremiumRepository.findAll();
    }

    public ClientePremium buscarPorId(int id) {
        return clientePremiumRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente premium no encontrado"));
    }
}
