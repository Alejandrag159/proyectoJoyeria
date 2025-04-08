package com.example.proyectoArquitectaturaJoyeria.Repository;

import com.example.proyectoArquitectura.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}