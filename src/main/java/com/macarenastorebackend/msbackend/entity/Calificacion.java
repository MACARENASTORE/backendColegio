package com.macarenastorebackend.msbackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "calificaciones")
public class Calificacion {
    @Id
    private String id;
    private String estudianteId; // Referencia al estudiante
    private String asignaturaId; // Referencia a la asignatura
    private Double nota;

    // Constructores
    public Calificacion() {}

    public Calificacion(String estudianteId, String asignaturaId, Double nota) {
        this.estudianteId = estudianteId;
        this.asignaturaId = asignaturaId;
        this.nota = nota;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEstudianteId() { return estudianteId; }
    public void setEstudianteId(String estudianteId) { this.estudianteId = estudianteId; }
    public String getAsignaturaId() { return asignaturaId; }
    public void setAsignaturaId(String asignaturaId) { this.asignaturaId = asignaturaId; }
    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }
}
