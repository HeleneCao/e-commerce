package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name= "User")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

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

   @ManyToOne
   private RoleEntity role;

    @OneToMany
    private List<OrderEntity>commandeList;
}
