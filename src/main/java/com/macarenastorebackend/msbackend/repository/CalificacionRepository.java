package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.macarenastorebackend.msbackend.entity.Calificacion;

@Repository
public interface CalificacionRepository extends MongoRepository<Calificacion, String> {
}
