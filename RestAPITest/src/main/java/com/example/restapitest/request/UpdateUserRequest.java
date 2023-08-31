package com.example.restapitest.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequest {
    @NotNull(message = " name ko dc de trong")
    @NotEmpty(message = " name ko dc de trong")
    private String name;

    private String phone;
    private String address;
}
