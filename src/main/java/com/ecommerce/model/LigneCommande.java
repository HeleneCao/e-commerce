package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table(name= "LigneCommande")
public class LigneCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre")
    private Integer nombre;

    @Column(name="prixUnité")
    private float prixUnité;


}
