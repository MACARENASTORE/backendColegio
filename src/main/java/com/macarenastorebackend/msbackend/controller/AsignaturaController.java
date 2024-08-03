package com.macarenastorebackend.msbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.macarenastorebackend.msbackend.entity.Asignatura;
import com.macarenastorebackend.msbackend.service.AsignaturaService;

import java.util.List;

@RestController
@RequestMapping("/asignaturas")
@CrossOrigin(origins = "http://localhost:3000")  // Ajusta según tu frontend
public class AsignaturaController {
    
    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> getAllAsignaturas() {
        return asignaturaService.getAllAsignaturas();
    }

    @PostMapping
    public Asignatura createAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaService.createAsignatura(asignatura);
    }

    @GetMapping("/{id}")
    public Asignatura getAsignaturaById(@PathVariable String id) {
        return asignaturaService.getAsignaturaById(id);
    }

    @PutMapping("/{id}")
    public Asignatura updateAsignatura(@PathVariable String id, @RequestBody Asignatura asignatura) {
        return asignaturaService.updateAsignatura(id, asignatura);
    }

    @DeleteMapping("/{id}")
    public void deleteAsignatura(@PathVariable String id) {
        asignaturaService.deleteAsignatura(id);
    }
}
