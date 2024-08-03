package com.macarenastorebackend.msbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.macarenastorebackend.msbackend.entity.Calificacion;
import com.macarenastorebackend.msbackend.repository.CalificacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> getAllCalificaciones() {
        return calificacionRepository.findAll();
    }

    public Calificacion getCalificacionById(String id) {
        Optional<Calificacion> calificacion = calificacionRepository.findById(id);
        return calificacion.orElse(null);
    }

    public Calificacion createCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    public Calificacion updateCalificacion(String id, Calificacion calificacion) {
        if (calificacionRepository.existsById(id)) {
            calificacion.setId(id);
            return calificacionRepository.save(calificacion);
        } else {
            return null;
        }
    }

    public void deleteCalificacion(String id) {
        calificacionRepository.deleteById(id);
    }
}
