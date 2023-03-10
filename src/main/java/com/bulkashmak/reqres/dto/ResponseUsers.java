package com.bulkashmak.reqres.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUsers {

    @JsonProperty("page")
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    @JsonProperty("total")
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("data")
    private ArrayList<Data> data;
    @JsonProperty("support")
    private Support support;

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data {
        @JsonProperty("id")
        private int id;
        @JsonProperty("email")
        private String email;
        @JsonProperty("first_name")
        private String firstName;
        @JsonProperty("last_name")
        private String lastName;
        @JsonProperty("avatar")
        private String avatar;
    }

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Support{
        @JsonProperty("url")
        private String url;
        @JsonProperty("text")
        private String text;
    }
}
