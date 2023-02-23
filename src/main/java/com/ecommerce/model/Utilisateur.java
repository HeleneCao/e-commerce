package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name= "Utilisateur")
public class Utilisateur {

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
    private List<Commande>commandeList;
}
