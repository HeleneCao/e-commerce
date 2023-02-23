package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Produit {

    @Id
    private Integer id;
    private String nom;
    private float prix;

    public Produit() {
    }

    public Produit(Integer id, String nom, float prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit produit)) return false;
        return Float.compare(produit.getPrix(), getPrix()) == 0 && Objects.equals(getId(), produit.getId()) && Objects.equals(getNom(), produit.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getPrix());
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
