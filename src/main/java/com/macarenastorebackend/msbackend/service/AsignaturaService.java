package com.macarenastorebackend.msbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.macarenastorebackend.msbackend.entity.Asignatura;
import com.macarenastorebackend.msbackend.repository.AsignaturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService {
    
    @Autowired
    private AsignaturaRepository asignaturaRepository;
    
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }
    
    public Asignatura getAsignaturaById(String id) {
        Optional<Asignatura> asignatura = asignaturaRepository.findById(id);
        return asignatura.orElse(null);
    }
    
    public Asignatura createAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }
    
    public Asignatura updateAsignatura(String id, Asignatura asignatura) {
        if (asignaturaRepository.existsById(id)) {
            asignatura.setId(id);
            return asignaturaRepository.save(asignatura);
        } else {
            return null;
        }
    }
    
    public void deleteAsignatura(String id) {
        asignaturaRepository.deleteById(id);
    }
}
