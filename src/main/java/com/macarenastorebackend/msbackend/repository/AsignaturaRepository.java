package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.macarenastorebackend.msbackend.entity.Asignatura;

@Repository
public interface AsignaturaRepository extends MongoRepository<Asignatura, String> {
}
