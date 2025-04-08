package com.example.proyectoArquitectaturaJoyeria.Services;

import com.example.proyectoArquitectatura.Model.Estudiante;
import com.example.proyectoArquitectatura.Model.Profesor;
import com.example.proyectoArquitectatura.Repository.EstudianteRepository;
import com.example.proyectoArquitectatura.Repository.ProfesorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServices {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Transactional
    public Estudiante guardarEstudiante(Estudiante estudiante, int profesorId) {
        Profesor profesor = profesorRepository.findById(profesorId)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado"));

        profesor.addEstudiante(estudiante);
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> listarTodos() {
        return estudianteRepository.findAll();
    }

    public List<Estudiante> listarPorProfesor(int profesorId) {
        return estudianteRepository.findByProfesorId(profesorId);
    }
}
