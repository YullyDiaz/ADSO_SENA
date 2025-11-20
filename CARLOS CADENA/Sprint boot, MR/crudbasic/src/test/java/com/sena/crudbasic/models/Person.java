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

@Table(name = "Person")
public class Person {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date birthDate;
    private String nationality;
}
