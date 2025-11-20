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
@Table(name = "Budget")

public class Budget {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer budgetId;
    private Integer movieId;
    private Integer departmentId;
    private Double allocatedAmount;
    private Double spentAmount;
    private Integer fiscalYear;
}
