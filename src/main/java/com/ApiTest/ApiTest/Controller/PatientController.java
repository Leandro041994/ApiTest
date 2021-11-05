package com.ApiTest.ApiTest.Controller;

import com.ApiTest.ApiTest.Model.Patient;
import com.ApiTest.ApiTest.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PatientController {

    @Autowired
    private PatientService service;


    @RequestMapping(value = "patients", method = RequestMethod.GET)
    PatientService findAllNomDeFamille(@RequestParam(name = "Nom") String nom) {
        return this.service.findAllNomDeFamille(nom);
    }

    @GetMapping("/patients/{id}")
    public List<Patient> list(){
        return service.listAll();
    }


    @PostMapping("/patients")
    public void add(@RequestBody Patient patient){
        service.save(patient);
    }

    @PutMapping("/patients/{id}")
    public ResponseEntity<Object> add(@RequestBody Patient patient, @PathVariable Integer id){
        try {
            Patient existPatient = service.get(id);
            service.save(patient);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
