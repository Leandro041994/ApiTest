package com.ApiTest.ApiTest.Service;

import com.ApiTest.ApiTest.Model.Data;
import com.ApiTest.ApiTest.Model.Patient;
import com.ApiTest.ApiTest.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class PatientService {

    @Autowired
    private static PatientRepository repo;

    public static Data getData() {
        return (Data) PatientRepository.findAllNomDeFamille();
    }


    @RequestMapping(value = "patients", method = RequestMethod.GET)
    public PatientService findAllNomDeFamille(@RequestParam(name = "nom") String nom) {
        return this.repo.findAllNomDeFamille(nom);
    }

    public List<Patient> listAll(){
        return repo.findAll();
    }

    public void save(Patient patient){
        repo.save(patient);
    }

    public Patient get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
