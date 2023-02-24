package com.ecommerce.dto;

import com.ecommerce.entities.OrderEntity;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<OrderEntity> orderEntityList;
}
