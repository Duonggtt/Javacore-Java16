package com.example.restapitest.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false,unique = true)
    private String email;

    @Column(name = "phone", nullable = false,unique = true)
    private String phone;

    private String address;
    private String avatar;

    @Column(name = "password", nullable = false)
    private String password;
}
