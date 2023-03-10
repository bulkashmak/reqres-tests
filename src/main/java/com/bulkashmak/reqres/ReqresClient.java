package com.bulkashmak.reqres;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class ReqresClient {

    protected RequestSpecification defaultSpec;

    public ReqresClient() {
        this.defaultSpec = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .setConfig(RestAssuredConfig.config()
                        .httpClient(HttpClientConfig.httpClientConfig()
                                .setParam("http.connection.timeout", 60000)))
                .build();
    }
}