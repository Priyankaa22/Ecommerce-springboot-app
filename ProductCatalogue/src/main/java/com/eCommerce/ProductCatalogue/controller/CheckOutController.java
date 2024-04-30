package com.eCommerce.ProductCatalogue.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.ProductCatalogue.model.CheckOut;

import com.eCommerce.ProductCatalogue.service.CheckOutService;


@RestController
@RequestMapping("/checkout")
public class CheckOutController {
	@Autowired
    private CheckOutService checkoutService;

	
	@PostMapping("/placeOrder")
	public CheckOut placeOrder(@RequestBody CheckOut checkOut ) {
		return checkoutService.placeOrder(checkOut);
	}
    
    @GetMapping("/{checkoutId}")
    public Optional<CheckOut>  getCheckoutDetails(@PathVariable Long checkoutId) {
    	return checkoutService.getCheckoutDetails(checkoutId);
    }
}
