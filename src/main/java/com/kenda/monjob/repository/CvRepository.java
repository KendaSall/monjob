package com.kenda.monjob.repository;

import com.kenda.monjob.entity.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Integer> {
    Cv findByName(String nom);
}
