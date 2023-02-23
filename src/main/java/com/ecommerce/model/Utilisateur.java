package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    private Integer Id;
    private String nom;
    private String prénom;
    private String email;
    private String password;
    private String role;
}
