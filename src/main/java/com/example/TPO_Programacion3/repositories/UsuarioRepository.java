package com.example.TPO_Programacion3.repositories;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

import com.example.TPO_Programacion3.entity.UsuarioEntity;

import reactor.core.publisher.Mono;

@Repository
public interface UsuarioRepository extends ReactiveNeo4jRepository<UsuarioEntity, String> {
    Mono<UsuarioEntity> findById(String nombre);
}