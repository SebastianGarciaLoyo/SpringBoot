package com.consultas.database.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Country {
    @Id
    @Column(columnDefinition =  "varchar(5)", nullable = false)
    private String codecountry;
    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String namecountry;

    @OneToMany(mappedBy = "countries")
    private List<Region> regions;

    public Country() {
    }
    public String getCodecountry() {
        return codecountry;
    }
    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }
    public String getNamecountry() {
        return namecountry;
    }
    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }
    
}
