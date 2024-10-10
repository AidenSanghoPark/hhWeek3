package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductResponse {
    private Long id;
    private String name;
    private Double price;
    private Long stock;

    public ProductResponse(Long id, String name, Double price, Long stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

}
