package com.kenda.monjob.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offre {
    @Id
    private int id;
    private String nomOffre;
    private String description;
    private Date date;
}
