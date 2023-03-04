package com.kenda.monjob.service;

import com.kenda.monjob.entity.Cv;
import com.kenda.monjob.repository.CvRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CvService {

    @Autowired
    private CvRepository repository;


    public Cv saveCv(Cv cv){
        return repository.save(cv);
    }


    public List<Cv> saveCv(List<Cv> cvs){
        return repository.saveAll(cvs);
    }


    public List<Cv> getCvs(){
        return repository.findAll();
    }


    public Cv getCvById(int id){
        return repository.findById(id).orElse(null);
    }


    public Cv getCvByNom(String nom){
        return repository.findByName(nom);
    }


    public String deleteById(int id){
        repository.deleteById(id);
        return "Le candidat retire est le " + id;
    }


    public Cv updateCv(Cv cv){
        Cv  existingCv = repository.findById(cv.getId()).orElse(cv);
        existingCv.setNom(cv.getNom());
        existingCv.setPrenom(cv.getPrenom());
        existingCv.setAge(cv.getAge());
        existingCv.setAdresse(cv.getAdresse());
        existingCv.setEmail(cv.getEmail());
        existingCv.setTelephone(cv.getTelephone());
        existingCv.setSpecialite(cv.getSpecialite());
        existingCv.setNiveauEtude(cv.getNiveauEtude());
        existingCv.setExperienceProfessionelle(cv.getExperienceProfessionelle());
        return repository.save(existingCv);
    }
}
