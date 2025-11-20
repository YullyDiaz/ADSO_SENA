/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.crudbasic.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lonbok.AllargsConstructor;
import lonbok.Data;
import lonbok.NoargsConstructor;

@Entity
@Data
@AllargsConstructor
@NoargsConstructor

@Table(name = "Genre")
public class Genre {
    
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer genreId;
    private String genreName;
}
