package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name= "OrderLine_entity")
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineEntity {

    @Id
    private Integer id;

    @Column(name="number")
    private Integer number;

    @Column(name="unit_price")
    private float unit_price;





}
