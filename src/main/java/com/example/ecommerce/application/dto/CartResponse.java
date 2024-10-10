package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartResponse {

    private Long productId;
    private int quantity;

    public CartResponse(Long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

}
