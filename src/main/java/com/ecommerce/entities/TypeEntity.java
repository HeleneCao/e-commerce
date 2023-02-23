package com.ecommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Type_entity")
@AllArgsConstructor
@NoArgsConstructor
public class TypeEntity {

    @Id

    private Long id;

    @Column(name = "title")
    private String title;


}
