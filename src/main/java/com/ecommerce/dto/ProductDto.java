package com.ecommerce.dto;

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
    private List<TagDto> tagDtoList;


}
