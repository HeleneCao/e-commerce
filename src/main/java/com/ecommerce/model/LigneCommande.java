package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class LigneCommande {

    @Id
    private Integer id;
    private Integer nombre;
    private float prixUnité;

    public LigneCommande() {
    }

    public LigneCommande(Integer id, Integer nombre, float prixUnité) {
        this.id = id;
        this.nombre = nombre;
        this.prixUnité = prixUnité;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public float getPrixUnité() {
        return prixUnité;
    }

    public void setPrixUnité(float prixUnité) {
        this.prixUnité = prixUnité;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LigneCommande that)) return false;
        return Float.compare(that.getPrixUnité(), getPrixUnité()) == 0 && Objects.equals(getId(), that.getId()) && Objects.equals(getNombre(), that.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getPrixUnité());
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", prixUnité=" + prixUnité +
                '}';
    }
}
