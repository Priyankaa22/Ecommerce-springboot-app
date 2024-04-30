package com.eCommerce.Cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.Cart.dao.CartRepo;
import com.eCommerce.Cart.model.Cart;




@Service
public class CartService {

	@Autowired
	 private CartRepo cartRepository;

	

    public Cart addToCart(Cart cartItem) {
        return cartRepository.save(cartItem);
    }
    public void removeFromCart(Long cartItemId) {
        cartRepository.deleteById(cartItemId);
    }

	
	
	public List<Cart> getUserCart(Long userId) {
		// TODO Auto-generated method stub
		return cartRepository.findByUserId(userId);
	}
	public static void placeOrder(Long userId) {
		// TODO Auto-generated method stub
		
	}
	public static double getTotalPrice(Long userId) {
		// TODO Auto-generated method stub
		return 0;
	}
}
