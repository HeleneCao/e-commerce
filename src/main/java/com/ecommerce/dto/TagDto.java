package com.ecommerce.dto;


import lombok.*;


import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TagDto {


    private Long id;
    private String value;
    private List<ProductDto> productDtoList;


}
