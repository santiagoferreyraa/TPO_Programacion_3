package com.example.TPO_Programacion3.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node("Usuario")
public class UsuarioEntity {
   @Id
   private final String nombre;

   @Relationship(type = "SIGUE", direction = OUTGOING)
   private Set<UsuarioEntity> seguidos = new HashSet<>();
   
   public UsuarioEntity(String nombre) {
      this.nombre = nombre;
   }
   
   public String getNombre() {
      return nombre;
   }

   public Set<UsuarioEntity> getSeguidos() {
      return seguidos;
   }

   public void setSeguidos(Set<UsuarioEntity> seguidos) {
      this.seguidos = seguidos;
   }
}