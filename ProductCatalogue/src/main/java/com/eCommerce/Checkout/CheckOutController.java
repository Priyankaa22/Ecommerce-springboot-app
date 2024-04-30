package com.eCommerce.Checkout;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.Cart.service.CartService;


@RestController
@RequestMapping("/api/checkout")
public class CheckOutController {
	@Autowired
    private CheckOutService checkoutService;

    @GetMapping("/totalPrice/{userId}")
    public ResponseEntity<Double> getTotalPrice(@PathVariable Long userId) {
        double totalPrice = CartService.getTotalPrice(userId);
        return new ResponseEntity<>(totalPrice, HttpStatus.OK);
    }

    @PostMapping("/placeOrder/{userId}")
    public ResponseEntity<?> placeOrder(@PathVariable Long userId) {
        CartService.placeOrder(userId);
        return ResponseEntity.ok().build();
    }
}