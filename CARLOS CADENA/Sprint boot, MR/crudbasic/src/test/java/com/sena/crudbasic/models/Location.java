package com.sena.crudbasic.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import lonbok.AllargsConstructor;
import lonbok.Data;
import lonbok.NoargsConstructor;

@Entity
@Data
@AllargsConstructor
@NoargsConstructor

@Table(name = "Location")
public class Location {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;
    private String locationName;
    private String address;
    private String city;
    private String country;
    private Integer locationTypeId;
    private Double dailyCost;
    private Integer maxCapacity;
}