package com.macarenastorebackend.msbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.macarenastorebackend.msbackend.entity.Estudiante;
import com.macarenastorebackend.msbackend.repository.EstudianteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getAllEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante getEstudianteById(String id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        return estudiante.orElse(null);
    }

    public Estudiante createEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante updateEstudiante(String id, Estudiante estudiante) {
        if (estudianteRepository.existsById(id)) {
            estudiante.setId(id);
            return estudianteRepository.save(estudiante);
        } else {
            return null;
        }
    }

    public void deleteEstudiante(String id) {
        estudianteRepository.deleteById(id);
    }
}
