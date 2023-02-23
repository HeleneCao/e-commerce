package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "LigneCommande")
public class LigneCommandeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre")
    private Integer nombre;

    @Column(name="prixUnité")
    private float prixUnité;


}
