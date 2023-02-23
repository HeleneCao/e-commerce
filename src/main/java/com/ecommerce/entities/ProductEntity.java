package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name="Product_entity")
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private float price;

    @Column(name="quantity")
    private Integer quantity;

    @ManyToMany
    private List<TagEntity> tagEntityList;




}
