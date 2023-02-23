package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="Order")
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

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
    private List<OrderLineEntity> ligneCommandeList;




}
