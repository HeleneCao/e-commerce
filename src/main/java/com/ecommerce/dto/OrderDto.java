package com.ecommerce.dto;

import lombok.*;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDto {

    private Long id;
    private Date orderDate;
    private String statusDate;
    private String comment;
    private List<OrderLineDto> orderLineDtoList;

}
