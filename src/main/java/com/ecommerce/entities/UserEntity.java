package com.ecommerce.entities;

import jakarta.persistence.*;

import lombok.*;

import java.util.List;


@Data
@Entity
@Table(name= "User_entity")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    private Long Id;


    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne
    private RoleEntity roleEntity;

    @OneToMany
    private List<OrderEntity> orderEntityList;


}
