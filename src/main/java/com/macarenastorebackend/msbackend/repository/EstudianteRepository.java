package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.macarenastorebackend.msbackend.entity.Estudiante;

@Repository
public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
}
