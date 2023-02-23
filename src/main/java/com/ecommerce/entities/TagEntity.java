package com.ecommerce.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name="Tag_entity")
@AllArgsConstructor
@NoArgsConstructor
public class TagEntity {

    @Id
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToMany(mappedBy = "tagEntityList")
    private List<ProductEntity> productEntityList;



}
