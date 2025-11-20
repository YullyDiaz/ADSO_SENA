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

@Table(name = "Technical_Team")
public class TechnicalTeam {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer teamId;
    private Integer movieId;
    private Integer personId;
    private Integer departmentId;
    private Integer positionId;
    private Date hireDate;
    private Date endDate;
    private Double monthlySalary;
}


