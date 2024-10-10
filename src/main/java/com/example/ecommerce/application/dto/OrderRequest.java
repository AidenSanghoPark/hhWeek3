package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class OrderRequest {

    private Long userId;
    private List<OrderItem> items;

    // OrderItem inner class
    @Setter
    @Getter
    public static class OrderItem {

        private Long productId;
        private int quantity;

    }
}
