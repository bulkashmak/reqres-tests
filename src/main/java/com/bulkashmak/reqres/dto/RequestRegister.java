package com.bulkashmak.reqres.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RequestRegister {

    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
}
