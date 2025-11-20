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

@Table(name = "Cast")
public class Cast {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer castId;
    private Integer movieId;
    private Integer personId;
    private String characterName;
    private Double salary;
    private Integer roleId;
    private Date contractStart;
    private Date contractEnd;
}
