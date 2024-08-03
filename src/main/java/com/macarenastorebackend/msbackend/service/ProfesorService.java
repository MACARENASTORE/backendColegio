package com.macarenastorebackend.msbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.macarenastorebackend.msbackend.entity.Profesor;
import com.macarenastorebackend.msbackend.repository.ProfesorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    
    @Autowired
    private ProfesorRepository profesorRepository;
    
    public List<Profesor> getAllProfesores() {
        return profesorRepository.findAll();
    }
    
    public Profesor getProfesorById(String id) {
        Optional<Profesor> profesor = profesorRepository.findById(id);
        return profesor.orElse(null);
    }
    
    public Profesor createProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }
    
    public Profesor updateProfesor(String id, Profesor profesor) {
        if (profesorRepository.existsById(id)) {
            profesor.setId(id);
            return profesorRepository.save(profesor);
        } else {
            return null;
        }
    }
    
    public void deleteProfesor(String id) {
        profesorRepository.deleteById(id);
    }
}
