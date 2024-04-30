package com.eCommerce.Cart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.Cart.model.Cart;

public interface CartRepo extends JpaRepository<Cart,Long> {
	List<Cart> findByUserId(Long userId);
	
}
