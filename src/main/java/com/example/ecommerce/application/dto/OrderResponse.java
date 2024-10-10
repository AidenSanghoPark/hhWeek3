package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderResponse {

    private String message;
    private Double remainingBalance;

    public OrderResponse(String message, Double remainingBalance) {
        this.message = message;
        this.remainingBalance = remainingBalance;
    }

}
