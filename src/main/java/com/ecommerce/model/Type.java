package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Type {

    @Id
    private Integer id;
    private String libellé;

    public Type() {
    }

    public Type(Integer id, String libellé) {
        this.id = id;
        this.libellé = libellé;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Type type)) return false;
        return Objects.equals(getId(), type.getId()) && Objects.equals(getLibellé(), type.getLibellé());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLibellé());
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", libellé='" + libellé + '\'' +
                '}';
    }
}
