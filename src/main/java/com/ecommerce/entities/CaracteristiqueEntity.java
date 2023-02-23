package com.ecommerce.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="Caracteristique")
public class CaracteristiqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(mappedBy = "caracteristiques")
    @Column(name = "valeur_caracteristique")
    private List<ProduitEntity> produits;


}
