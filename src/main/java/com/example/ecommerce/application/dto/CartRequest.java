package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartRequest {

    private Long userId;
    private Long productId;
    private int quantity;


}
