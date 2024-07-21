package com.swagger.swaggerdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Validated
public class Item implements Serializable {

    @JsonProperty("id")
    int id;
    @JsonProperty("name")
    String name;
    @JsonProperty("price")
    int price;

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
