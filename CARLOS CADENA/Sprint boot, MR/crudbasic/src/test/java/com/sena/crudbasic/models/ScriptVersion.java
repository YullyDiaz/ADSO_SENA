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

@Table(name = "Script_Version")
public class ScriptVersion {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer versionId;
    private Integer movieId;
    private String versionNumber;
    private Date revisionDate;
    private Integer authorId;
    private String changesDescription;
    private String filePath;
}
