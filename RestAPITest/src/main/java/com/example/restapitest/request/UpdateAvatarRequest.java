package com.example.restapitest.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateAvatarRequest {

    private String avatar;
}
