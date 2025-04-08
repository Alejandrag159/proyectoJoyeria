package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectatura.Model.Profesor;
import com.example.proyectoArquitectatura.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServices {

    @Autowired
    public ProfesorRepository ProfesorRepository;

    public Profesor guardar(Profesor profesor) {
        return ProfesorRepository.save(profesor);
    }
    public List<Profesor> listar (){
        return ProfesorRepository.findAll();
    }
}
