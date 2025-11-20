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

@Table(name = "Scene_Equipment")
public class SceneEquipment {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer equipmentId;
    private Integer sceneId;
    private Integer equipmentTypeId;
    private Integer quantity;
    private Integer responsiblePersonId;
    private Date rentalStart;
    private Date rentalEnd;
}