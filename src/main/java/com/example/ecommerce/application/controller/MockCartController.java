package com.example.ecommerce.application.controller;

import com.example.ecommerce.application.dto.CartRequest;
import com.example.ecommerce.application.dto.CartResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/mock/cart")
public class MockCartController {

//    private final List<CartResponse> cart = new ArrayList<>()
    private final Map<Long, List<CartResponse>> cartMap = new HashMap<>();

    // 장바구니 조회 API (Mock)
    @GetMapping("/{userId}")
    public ResponseEntity<List<CartResponse>> getCart(@PathVariable Long userId) {
        List<CartResponse> userCart = cartMap.getOrDefault(userId, new ArrayList<>());
        return ResponseEntity.ok(userCart);
    }

    // 장바구니에 상품 추가 API (Mock)
    @PostMapping("/add")
    public ResponseEntity<String> addToCart(@RequestBody CartRequest request) {
        List<CartResponse> userCart = cartMap.getOrDefault(request.getUserId(), new ArrayList<>());
        userCart.add(new CartResponse(request.getProductId(), request.getQuantity()));
        cartMap.put(request.getUserId(), userCart);
        return ResponseEntity.ok("장바구니에 상품이 추가되었습니다.");
    }

    // 장바구니에서 상품 제거 API (Mock)
    @DeleteMapping("/remove")
    public ResponseEntity<String> removeFromCart(@RequestBody CartRequest request) {
        List<CartResponse> userCart = cartMap.getOrDefault(request.getUserId(), new ArrayList<>());
        userCart.removeIf(item -> Objects.equals(item.getProductId(), request.getProductId()));
        cartMap.put(request.getUserId(), userCart);
        return ResponseEntity.ok("장바구니에서 상품이 제거되었습니다.");
    }
}
