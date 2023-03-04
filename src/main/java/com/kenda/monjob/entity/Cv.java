package com.kenda.monjob.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cv {
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String email;
    private String telephone;
    private String specialite;
    private String niveauEtude;
    private String experienceProfessionelle;
    private String password;
}
