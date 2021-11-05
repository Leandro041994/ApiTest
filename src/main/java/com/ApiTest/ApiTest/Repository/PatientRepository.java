package com.ApiTest.ApiTest.Repository;

import com.ApiTest.ApiTest.Model.Patient;
import com.ApiTest.ApiTest.Service.PatientService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    PatientService findAllNomDeFamille(String nom);

    public static List<Patient> findAllNomDeFamille() {

        return PatientService.getData().getPatient().stream()
                .filter(patient -> patient.getNom().equals(patient.getNom()))
                .collect(Collectors.toList());
    }
}
