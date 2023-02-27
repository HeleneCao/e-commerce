package com.ecommerce.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderLineDto {

    private Long id;
    private Integer number;
    private float unit_price;



}
