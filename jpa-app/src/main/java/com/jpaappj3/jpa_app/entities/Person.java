package com.jpaappj3.jpa_app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "persons")
public class Person {
    // Definiendo el atributo 'id' como autoincremental para MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Definiendo los demÃ¡s atributos necesarios con sus columnas para la base de datos
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String name;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastname;

    @Column(columnDefinition = "VARCHAR(50)", nullable = true)
    private String programmingLanguage;


    // Definiendo los constructores de la clase
    public Person() {
    }

    public Person(Long id, String name, String lastname, String programmingLanguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programmingLanguage = programmingLanguage;
    }


    // Declarando los getter y setters de 'id'
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Declarando los getter y setters de 'name'
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Declarando los getter y setters de 'lastname'
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Declarando los getter y setters de 'programmingLanguage'
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}