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

@Table(name = "Scene")
public class Scene {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer sceneId;
    private Integer movieId;
    private Integer sceneNumber;
    private String description;
    private Integer estimatedDuration; // en minutos
    private Date plannedDate;
    private Integer actualDuration; // en minutos
    private Integer statusId;
}