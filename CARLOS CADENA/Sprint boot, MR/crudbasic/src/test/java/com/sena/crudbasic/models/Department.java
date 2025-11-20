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

@Table(name = "Department")
public class Department {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;
    private String departmentName;
    private String departmentHead;
}
