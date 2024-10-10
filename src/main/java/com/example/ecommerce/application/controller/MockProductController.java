package com.example.ecommerce.application.controller;

import com.example.ecommerce.application.dto.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/mock/products")
public class MockProductController {

    // 상품 조회 API (Mock)
    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        // Mock 응답 처리
        List<ProductResponse> products = Arrays.asList(
                new ProductResponse(1L, "상품 A", 100.00, 10L),
                new ProductResponse(2L, "상품 B", 200.00, 5L)
        );
        return ResponseEntity.ok(products);
    }
}
