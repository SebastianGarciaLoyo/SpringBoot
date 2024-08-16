package com.bases.datos.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombre;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellidos;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private int ultima_actualizacion;

    public Actor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(int ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    
}
