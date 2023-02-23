package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.Objects;
@Data
@Entity
@Table(name="Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dateCommande")
    private Date dateCommande;
    @Column(name = "etatCommande")
    private String etatCommande;

    @Column(name = "commentaire")
    private String commentaire;

    @OneToMany
    private List<LigneCommande> ligneCommandeList;



}
