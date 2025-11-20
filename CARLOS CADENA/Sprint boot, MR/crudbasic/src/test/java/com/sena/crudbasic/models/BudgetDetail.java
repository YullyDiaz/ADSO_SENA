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

@Table(name = "Budget_Detail")
public class BudgetDetail {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer budgetDetailId;
    private Integer budgetId;
    private Integer categoryId;
    private String concept;
    private Double amount;
    private Date expenseDate;
    private Integer supplierId;
    private String paymentStatus; // 'Pagado', 'Pendiente', 'Rechazado'
}