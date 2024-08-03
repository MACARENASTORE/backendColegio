package com.macarenastorebackend.msbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.macarenastorebackend.msbackend.entity.Calificacion;
import com.macarenastorebackend.msbackend.service.CalificacionService;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
@CrossOrigin(origins = "http://localhost:3000")  // Ajusta según tu frontend
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public List<Calificacion> getAllCalificaciones() {
        return calificacionService.getAllCalificaciones();
    }

    @PostMapping
    public Calificacion createCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.createCalificacion(calificacion);
    }

    @GetMapping("/{id}")
    public Calificacion getCalificacionById(@PathVariable String id) {
        return calificacionService.getCalificacionById(id);
    }

    @PutMapping("/{id}")
    public Calificacion updateCalificacion(@PathVariable String id, @RequestBody Calificacion calificacion) {
        return calificacionService.updateCalificacion(id, calificacion);
    }

    @DeleteMapping("/{id}")
    public void deleteCalificacion(@PathVariable String id) {
        calificacionService.deleteCalificacion(id);
    }
}
