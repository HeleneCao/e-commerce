package com.ecommerce.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name= "Stock")
public class Stock{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name= "quantité")
        private Integer quantité;


}


