/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudStructure.Models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
@Entity
public class personnel {
    private Long id;
    private String nom;
    private String penom;
    
    private String ville;
    private int tel;
    private String deparetement;

    public personnel() {
    }
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPenom() {
        return penom;
    }

    public String getVille() {
        return ville;
    }

    public int getTel() {
        return tel;
    }

    public String getDeparetement() {
        return deparetement;
    }

    
   
    
    public void setId(Long id) {
        this.id = id;
    }

   

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPenom(String penom) {
        this.penom = penom;
    }



    

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setDeparetement(String deparetement) {
        this.deparetement = deparetement;
    }
    
    
    
    
}
