package com.eCommerce.ProductCatalogue.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.eCommerce.ProductCatalogue.dao.CartRepo;
import com.eCommerce.ProductCatalogue.model.Cart;





@Service
public class CartService {

	@Autowired
	 private CartRepo cartRepository;


	 public CartService(CartRepo cartRepository) {
	
		this.cartRepository = cartRepository;
	}
	 public Cart addToCart(Cart cart) {
		 
			return cartRepository.save(cart);
		}
	
    public void removeFromCart(Long cartItemId) {
    	cartRepository.deleteById(cartItemId);
		
	}
   
	public static double getTotalPrice(Long userId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void placeOrder(Long userId) {
		// TODO Auto-generated method stub
		
	}

	public List<Cart> getAllProductsInCart() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}


	

}
