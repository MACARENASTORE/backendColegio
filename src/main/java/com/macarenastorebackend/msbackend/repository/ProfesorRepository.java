package com.macarenastorebackend.msbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.macarenastorebackend.msbackend.entity.Profesor;

@Repository
public interface ProfesorRepository extends MongoRepository<Profesor, String> {
}
