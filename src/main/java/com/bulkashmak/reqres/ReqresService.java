package com.bulkashmak.reqres;

import com.bulkashmak.reqres.dto.RequestLogin;
import com.bulkashmak.reqres.dto.RequestRegister;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class ReqresService extends ReqresClient {

    private static final String BASE = "/api";
    private static final String LOGIN = "/login";
    private static final String REGISTER = "/register";
    private static final String USERS = "/users";

    public ValidatableResponse postLogin(RequestLogin requestBody) {
        return given()
                .spec(defaultSpec)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(BASE + LOGIN)
                .then();
    }

    public ValidatableResponse postRegister(RequestRegister requestBody) {
        return given()
                .spec(defaultSpec)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(BASE + REGISTER)
                .then();
    }

    public ValidatableResponse getUsers() {
        return given()
                .spec(defaultSpec)
                .get(BASE + USERS)
                .then();
    }
}
