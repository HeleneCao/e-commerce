package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "OrderLine_entity")
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineEntity {

    @Id
    private Long id;

    @Column(name="number")
    private Integer number;

    @Column(name="unit_price")
    private float unit_price;





}
