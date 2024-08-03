package com.macarenastorebackend.msbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.macarenastorebackend.msbackend.entity.Profesor;
import com.macarenastorebackend.msbackend.service.ProfesorService;

import java.util.List;

@RestController
@RequestMapping("/profesores")
@CrossOrigin(origins = "http://localhost:3000")
public class ProfesorController {
    
    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getAllProfesores() {
        return profesorService.getAllProfesores();
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody Profesor profesor) {
        return profesorService.createProfesor(profesor);
    }

    @GetMapping("/{id}")
    public Profesor getProfesorById(@PathVariable String id) {
        return profesorService.getProfesorById(id);
    }

    @PutMapping("/{id}")
    public Profesor updateProfesor(@PathVariable String id, @RequestBody Profesor profesor) {
        return profesorService.updateProfesor(id, profesor);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesor(@PathVariable String id) {
        profesorService.deleteProfesor(id);
    }
}
