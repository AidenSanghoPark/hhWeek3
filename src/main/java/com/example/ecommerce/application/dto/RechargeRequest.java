package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RechargeRequest {
    // Getters and Setters
    private Long userId;
    private Double amount;

}
