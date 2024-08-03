package com.macarenastorebackend.msbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.macarenastorebackend.msbackend.entity.Estudiante;
import com.macarenastorebackend.msbackend.service.EstudianteService;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin(origins = "http://localhost:3000")  // Ajusta según tu frontend
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAllEstudiantes() {
        return estudianteService.getAllEstudiantes();
    }

    @PostMapping
    public Estudiante createEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.createEstudiante(estudiante);
    }

    @GetMapping("/{id}")
    public Estudiante getEstudianteById(@PathVariable String id) {
        return estudianteService.getEstudianteById(id);
    }

    @PutMapping("/{id}")
    public Estudiante updateEstudiante(@PathVariable String id, @RequestBody Estudiante estudiante) {
        return estudianteService.updateEstudiante(id, estudiante);
    }

    @DeleteMapping("/{id}")
    public void deleteEstudiante(@PathVariable String id) {
        estudianteService.deleteEstudiante(id);
    }
}
