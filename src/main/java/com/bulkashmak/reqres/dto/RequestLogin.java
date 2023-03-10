package com.bulkashmak.reqres.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RequestLogin {

    @JsonProperty("email")
    public String email;
    @JsonProperty("password")
    public String password;
}
