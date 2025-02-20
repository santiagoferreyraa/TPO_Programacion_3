package com.example.TPO_Programacion3.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;;

@Node("Usuario")
public class UsuarioEntity {
   @Id
   private final String nombre;
   private final Integer id;

   @Relationship(type = "SIGUE", direction = OUTGOING)
   private Set<UsuarioEntity> seguidos = new HashSet<>();

   @Relationship(type = "SIGUE", direction = INCOMING)
   private Set<UsuarioEntity> seguidores = new HashSet<>();
   
   public UsuarioEntity(String nombre, Integer id) {
      this.nombre = nombre;
      this.id = id;
   }
   
   public String getNombre() {
      return nombre;
   }

   public Integer getId() {
      return id;
   }

   public Set<UsuarioEntity> getSeguidos() {
      return seguidos;
   }

   public void setSeguidos(Set<UsuarioEntity> seguidos) {
      this.seguidos = seguidos;
   }

   public Set<UsuarioEntity> getSeguidores() {
      return seguidores;
   }

   public void setSeguidores(Set<UsuarioEntity> seguidores) {
      this.seguidores = seguidores;
   }
}