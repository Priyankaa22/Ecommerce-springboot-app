package com.eCommerce.Cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.Cart.model.Cart;
import com.eCommerce.Cart.service.CartService;
import com.eCommerce.ProductCatalogue.feignClient.ProductServiceClient;
import com.eCommerce.ProductCatalogue.model.Product;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
    private ProductServiceClient productServiceClient;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Cart>> getUserCart(@PathVariable Long userId) {
        List<Cart> cartItems = cartService.getUserCart(userId);
        return new ResponseEntity<>(cartItems, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cart> addToCart(@RequestBody Cart cartItem) {
        Product product = productServiceClient.getProductById(cartItem.getProductId());
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(cartService.addToCart(cartItem), HttpStatus.CREATED);
    }

    @DeleteMapping("/{cartItemId}")
    public ResponseEntity<?> removeFromCart(@PathVariable Long cartItemId) {
        cartService.removeFromCart(cartItemId);
        return ResponseEntity.ok().build();
    }
}