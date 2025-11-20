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

@Table(name = "Scene_Cast")
public class SceneCast {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer sceneCastId;
    private Integer sceneId;
    private Integer personId;
    private Integer scheduledHours;
    private Integer actualHours;
    private Integer overtimeHours;
    private Boolean costumeRequired;
}
