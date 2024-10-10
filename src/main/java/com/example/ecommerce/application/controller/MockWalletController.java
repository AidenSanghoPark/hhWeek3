package com.example.ecommerce.application.controller;

import com.example.ecommerce.application.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mock/wallet")
public class MockWalletController {

    // 잔액 충전 API (Mock)
    @PostMapping("/recharge")
    public ResponseEntity<BalanceResponse> recharge(@RequestBody RechargeRequest request) {
        // Mock 응답 처리
        BalanceResponse response = new BalanceResponse("잔액이 성공적으로 충전되었습니다.", 150.00);
        return ResponseEntity.ok(response);
    }

    // 잔액 조회 API (Mock)
    @GetMapping("/balance/{userId}")
    public ResponseEntity<BalanceResponse> getBalance(@PathVariable Long userId) {
        // Mock 응답 처리
        BalanceResponse response = new BalanceResponse("잔액 조회 성공", 150.00);
        return ResponseEntity.ok(response);
    }
}
