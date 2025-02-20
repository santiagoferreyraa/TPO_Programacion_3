package com.example.TPO_Programacion3.repositories;

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

import com.example.TPO_Programacion3.entity.RedSocialEntity;

import reactor.core.publisher.Mono;

@Repository
public interface RedSocialRepository extends ReactiveNeo4jRepository<RedSocialEntity, String> {
    Mono<RedSocialEntity> findOneByNombre(String nombre);
}
