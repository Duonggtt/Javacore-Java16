package com.example.restapitest.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String avatar;
    private String password;
}
