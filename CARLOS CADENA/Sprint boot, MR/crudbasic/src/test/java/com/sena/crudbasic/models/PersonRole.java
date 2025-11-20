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

@Table(name = "Person_Role")
public class PersonRole {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer personRoleId;
    private Integer personId;
    private Integer roleId;
    private Integer experienceYears;
}
