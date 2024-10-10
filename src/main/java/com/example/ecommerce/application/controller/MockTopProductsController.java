package com.example.ecommerce.application.controller;

import com.example.ecommerce.application.dto.TopProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/mock/products/top-sellers")
public class MockTopProductsController {

    // 인기 상품 조회 API (Mock)
    @GetMapping
    public ResponseEntity<List<TopProductResponse>> getTopProducts() {
        // Mock 응답 처리
        List<TopProductResponse> topProducts = Arrays.asList(
                new TopProductResponse(1L, "상품 A", 100),
                new TopProductResponse(2L, "상품 B", 80)
        );
        return ResponseEntity.ok(topProducts);
    }
}
