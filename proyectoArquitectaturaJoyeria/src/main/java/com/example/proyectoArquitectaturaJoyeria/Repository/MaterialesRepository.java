package com.example.proyectoArquitectaturaJoyeria.Repository;



import com.example.proyectoArquitectura.Model.Productos_Materiales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Productos_Materiales, Integer> {
}

