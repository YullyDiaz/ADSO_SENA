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

@Table(name = "Movie")
public class Movie {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
     private Integer movieId;
    private String title;
    private Integer genreId;
    private Double totalBudget;
    private Date startDate;
    private Date endDate;
    private String status; // 'Pre-producción', 'Producción', 'Post-producción', 'Estrenada'
}
