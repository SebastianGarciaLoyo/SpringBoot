package com.actividad1.formulario.models.dto;

public class User {
    private String name;
    private String lastname;
    private int age;
    private String nationality;
    public User() {
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public User(String name, String lastname, int age, String nationality) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.nationality = nationality;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    
}
