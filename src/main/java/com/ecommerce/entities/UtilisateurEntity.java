package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name= "Utilisateur")
public class UtilisateurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name ="nom")
    private String nom;

    @Column(name ="prénom")
    private String prénom;

    @Column(name ="email")
    private String email;

    @Column(name ="password")
    private String password;

    @OneToMany
    private List<CommandeEntity>commandeList;
}
