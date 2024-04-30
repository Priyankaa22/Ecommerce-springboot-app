package com.eCommerce.ProductCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.ProductCatalogue.model.Cart;
import com.eCommerce.ProductCatalogue.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	

	 @PostMapping("/addToCart")
	    public Cart addToCart(@RequestBody Cart cart) {
	     return cartService.addToCart(cart);
	    }

	 @GetMapping("/getAllInCart")
	    public List<Cart> getAllProductInCart(){
		 return cartService.getAllProductsInCart();
	 }

	    @DeleteMapping("/{cartItemId}")
	    public void removeFromCart(@PathVariable Long cartItemId) {
	        cartService.removeFromCart(cartItemId);
	    }
}