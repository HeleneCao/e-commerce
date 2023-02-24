package com.ecommerce.dto;

import com.ecommerce.entities.TagEntity;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {


    private Long id;

    private String name;

    private float price;
    private Integer quantity;
    private List<TagEntity> tagEntityList;
}
