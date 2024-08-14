package com.consultas.database.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Region {
    @Id
    @Column(columnDefinition =  "varchar(5)", nullable = false)
    private String coderegion;
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameregion;
    public Region() {
    }
    public String getCoderegion() {
        return coderegion;
    }
    public void setCoderegion(String coderegion) {
        this.coderegion = coderegion;
    }
    public String getNameregion() {
        return nameregion;
    }
    public void setNameregion(String nameregion) {
        this.nameregion = nameregion;
    }
    
}
