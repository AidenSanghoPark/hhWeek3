package com.example.ecommerce.application.controller;

import com.example.ecommerce.application.dto.OrderResponse;
import com.example.ecommerce.application.dto.UserPurchaseRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api/mock/orders")
public class MockOrderController {

    // Mock 데이터베이스: 사용자 ID와 잔액
    private final Map<Long, Double> userBalances = new HashMap<>();

    public MockOrderController() {
        // 초기 사용자 잔액 설정 (예시)
        userBalances.put(1L, 100.00);
        userBalances.put(2L, 50.00);
    }

    // 주문 및 결제 API (Mock)
    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody UserPurchaseRequest request) {
        Long userId = request.getUserId();
        double orderTotal = calculateOrderTotal(request); // 주문 총액 계산

        // 사용자 잔액 확인
        Double currentBalance = userBalances.get(userId);
        if (currentBalance == null) {
            return ResponseEntity.badRequest().body(new OrderResponse("사용자를 찾을 수 없습니다.", 0.00));
        }

        if (currentBalance < orderTotal) {
            return ResponseEntity.badRequest().body(new OrderResponse("잔액이 부족합니다.", currentBalance));
        }

        // 잔액 차감
        userBalances.put(userId, currentBalance - orderTotal);

        // Mock 응답 처리
        OrderResponse response = new OrderResponse("주문이 성공적으로 완료되었습니다.", currentBalance - orderTotal);
        return ResponseEntity.ok(response);
    }

    // 주문 총액 계산 메서드
    private double calculateOrderTotal(UserPurchaseRequest request) {
        double total = 0;
        for (UserPurchaseRequest.Item item : request.getItems()) {
            total += item.getQuantity() * 10.00; // 각 상품의 가격을 10.00으로 가정
        }
        return total;
    }
}
