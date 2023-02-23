package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="Produit")
public class ProduitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nom")
    private String nom;

    @Column(name="prix")
    private float prix;

    private Integer qantité;

    @ManyToMany
    private List<CaracteristiqueEntity> caracteristiqueList;


}
