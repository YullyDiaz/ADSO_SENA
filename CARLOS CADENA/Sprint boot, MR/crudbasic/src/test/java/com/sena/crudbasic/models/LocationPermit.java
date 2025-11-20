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

@Table(name = "Location_Permit")
public class LocationPermit {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
     private Integer permitId;
    private Integer locationId;
    private Integer permitTypeId;
    private String permitNumber;
    private Date issueDate;
    private Date expiryDate;
    private Double cost;
    private String status; // 'Vigente', 'Vencido', 'En proceso'
}
