package com.bases.datos.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String descripcion;

    @Column(columnDefinition = "INT(4)", nullable = false )
    private int anyo_lanzamiento;

    @Column(columnDefinition = "INT", nullable = false)
    private int id_idioma_original;

    @Column(columnDefinition = "INT", nullable = false)
    private int duracion_alquiler;

    @Column(columnDefinition = "DECIMAL(4,2)", nullable = false)
    private double rental_rate;

    @Column(columnDefinition = "INT", nullable =  false)
    private int duracion;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = false)
    private double replacement_cost;

    @Column(columnDefinition = "ENUM('G','PG','PG-13','R','NC-17')", nullable = false)
    private String clasificacion;
    
    @Column(columnDefinition = "set('Trailers','Commentaries','Deleted Scenes','Behind the Scenes')", nullable = false)
    private String caracteristicas_especiales;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private String ultima_actualizacion;

    @OneToMany
    Idioma idioma;

    public Pelicula() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnyo_lanzamiento() {
        return anyo_lanzamiento;
    }

    public void setAnyo_lanzamiento(int anyo_lanzamiento) {
        this.anyo_lanzamiento = anyo_lanzamiento;
    }

    public int getId_idioma_original() {
        return id_idioma_original;
    }

    public void setId_idioma_original(int id_idioma_original) {
        this.id_idioma_original = id_idioma_original;
    }

    public int getDuracion_alquiler() {
        return duracion_alquiler;
    }

    public void setDuracion_alquiler(int duracion_alquiler) {
        this.duracion_alquiler = duracion_alquiler;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCaracteristicas_especiales() {
        return caracteristicas_especiales;
    }

    public void setCaracteristicas_especiales(String caracteristicas_especiales) {
        this.caracteristicas_especiales = caracteristicas_especiales;
    }

    public String getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(String ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

}
