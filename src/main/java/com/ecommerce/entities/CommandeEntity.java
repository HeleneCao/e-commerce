package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="Commande")
public class CommandeEntity {

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
    private List<LigneCommandeEntity> ligneCommandeEntityList;



}
