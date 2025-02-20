package com.example.TPO_Programacion3.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;;

@Node("RedSocial")
public class RedSocialEntity {
    @Id
    private final String nombre;
    private final Integer id;
    
    @Relationship(type = "USUARIOS", direction = OUTGOING)
    private Set<UsuarioEntity> usuarios = new HashSet<>();
    
    public RedSocialEntity(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    public Set<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }
}