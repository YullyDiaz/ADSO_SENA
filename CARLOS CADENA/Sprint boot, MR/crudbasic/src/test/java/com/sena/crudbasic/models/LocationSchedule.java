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

@Table(name = "Location_Schedule")
public class LocationSchedule {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
     private Integer scheduleId;
    private Integer locationId;
    private Date startDate;
    private Date endDate;
    private Integer reservedByMovie;
}
