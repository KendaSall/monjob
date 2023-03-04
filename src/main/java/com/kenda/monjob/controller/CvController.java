package com.kenda.monjob.controller;

import com.kenda.monjob.entity.Cv;
import com.kenda.monjob.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CvController {

    @Autowired
    private CvService service;

    @PostMapping("/addCv")
    public Cv addCv(@RequestBody Cv cv){
        return service.saveCv(cv); // Appel de la méthode saveProduct de ProductService pour sauvegarder le produit
    }

    @GetMapping("/cvs")
    public List<Cv> findAllCvs(){
        return service.getCvs(); // Appel de la méthode getProducts de ProductService pour récupérer tous les produits
    }

    @GetMapping("/cvs/{id}")
    public Cv findCvbyId(@PathVariable int id){
        return service.getCvById(id); // Appel de la méthode getProductById de ProductService pour récupérer le produit correspondant à l'id donné
    }

    @GetMapping("/cvs/{nom}")
    public Cv findCvbyName(@PathVariable String nom){
        return service.getCvByNom(nom);
    }

    @PutMapping("/update")
    public Cv updateCv(@RequestBody Cv cv){
        return service.updateCv(cv);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCv(@RequestBody int id){
        return service.deleteById(id);
    }
}
