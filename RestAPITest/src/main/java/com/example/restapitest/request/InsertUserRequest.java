package com.example.restapitest.request;

import lombok.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsertUserRequest {
    @NotNull(message = " name ko dc de trong")
    @NotEmpty(message = " name ko dc de trong")
    private String name;

    @NotNull(message = " email ko dc de trong")
    @NotEmpty(message = " email ko dc de trong")
    private String email;

    private String phone;
    private String address;

    @NotNull(message = " name ko dc de trong")
    private String password;
}
