package com.iset.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
public class Offre {
@Id 
@GeneratedValue
    long code;
    String intitulé;
    String spécialité;
    String société;
    int nbpostes;
    String pays;
    public Offre() {
    }
    public Offre(String intitulé, String spécialité, String société, int nbpostes, String pays) {
        this.spécialité = spécialité;
        this.intitulé = intitulé;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }
}

