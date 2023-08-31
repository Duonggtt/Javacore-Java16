package com.example.restapitest.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdatePasswordRequest {

    @NotNull(message = " oldPassword ko dc de trong")
    private String oldPassword;

    @NotNull(message = " newPassword ko dc de trong")
    private String newPassword;
}
