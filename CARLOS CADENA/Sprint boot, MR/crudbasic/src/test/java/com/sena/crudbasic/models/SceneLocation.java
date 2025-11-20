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

@Table(name = "Scene_Location")
public class SceneLocation {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer sceneLocationId;
    private Integer sceneId;
    private Integer locationId;
    private Date shootingDate;
    private Integer workedHours;
    private Integer statusId;
}

