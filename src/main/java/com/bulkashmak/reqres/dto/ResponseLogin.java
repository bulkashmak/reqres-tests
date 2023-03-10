package com.bulkashmak.reqres.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseLogin {

    @JsonProperty("token")
    private String token;
}
