package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Objects;

@Entity
public class Facture {

    @Id
    private Integer id;

    private float montant;

    public Facture() {
    }

    public Facture(Integer id, float montant) {
        this.id = id;
        this.montant = montant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facture facture)) return false;
        return Float.compare(facture.getMontant(), getMontant()) == 0 && Objects.equals(getId(), facture.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMontant());
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", montant=" + montant +
                '}';
    }
}
