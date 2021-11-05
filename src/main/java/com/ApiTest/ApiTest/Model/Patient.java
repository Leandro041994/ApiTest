package com.ApiTest.ApiTest.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Patient {

    private Integer id;
    private String nom;
    private String name;
    private Date dateDeNaissance;
    private String adresse;
    private String genre;



    public Patient(Integer id, String nom, String name, Date dateDeNaissance, String adresse, String genre) {
        this.id=id;
        this.nom = nom;
        this.name = name;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.genre = genre;
    }

    @Id
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
