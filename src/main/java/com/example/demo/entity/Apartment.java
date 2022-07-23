package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String apartmentname;
    private String location;

    public Apartment(String apartmentname, String location) {
        this.apartmentname = apartmentname;
        this.location = location;
    }

    public Apartment(Long id, String apartmentname, String location) {
        this.id = id;
        this.apartmentname = apartmentname;
        this.location = location;
    }

    public Apartment() {
    }

    public String getApartmentname() {
        return apartmentname;
    }

    public void setApartmentname(String apartmentname) {
        this.apartmentname = apartmentname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
