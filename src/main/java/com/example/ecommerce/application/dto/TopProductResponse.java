package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TopProductResponse {
    // Getters and Setters
    private Long id;
    private String name;
    private int sales;

    public TopProductResponse(Long id, String name, int sales) {
        this.id = id;
        this.name = name;
        this.sales = sales;
    }

}
