package com.example.restapitest.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String avatar;
}
