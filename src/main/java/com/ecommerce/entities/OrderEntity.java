package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="Order_entity")
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    @Id
    private Integer id;

    @Column(name = "orderDate")
    private Date orderDate;

    @Column(name = "statusDate")
    private String statusDate;

    @Column(name = "comment")
    private String comment;

    @OneToMany
    private List<OrderLineEntity> orderLineEntityList;





}
