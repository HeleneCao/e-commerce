package com.ecommerce.dto;


import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {


    private Long Id;
    private String firstName;
    private String lastName;
    @Email(message = "{email.not.valid}")
    private String email;
    private String password;
    private RoleDto roleDto;
    private List<OrderDto> orderDtoList;


}
