package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

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


}
