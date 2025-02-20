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
    
    @Relationship(type = "USUARIOS", direction = OUTGOING)
    private Set<UsuarioEntity> usuarios = new HashSet<>();
    
    public RedSocialEntity(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<UsuarioEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioEntity> usuarios) {
        this.usuarios = usuarios;
    }
}