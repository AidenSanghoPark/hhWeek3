package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BalanceResponse {
    // Getters and Setters
    private String message;
    private Double balance;

    public BalanceResponse(String message, Double balance) {
        this.message = message;
        this.balance = balance;
    }

}
