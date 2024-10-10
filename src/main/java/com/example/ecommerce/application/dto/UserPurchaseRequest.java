package com.example.ecommerce.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserPurchaseRequest {
    private Long userId;
    private List<Item> items;

    @Setter
    @Getter
    public static class Item {
        private Long productId;
        private int quantity;
    }
}
