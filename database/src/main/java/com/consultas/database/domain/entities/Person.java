package com.consultas.database.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Person {
    @Id
    @Column(name = "id_person", columnDefinition = "VARCHAR(20)", nullable = false)
    private String idPerson;

    @Column(name = "first_name", columnDefinition = "VARCHAR(50)", nullable = false)
    private String firstname;

    @Column(name = "las_name", columnDefinition = "VARCHAR(30)", nullable = false)
    private String lastname;

    @ManyToOne
    City cities;

    @ManyToOne
    TypePerson typepersons;

    public Person() {
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    

}

