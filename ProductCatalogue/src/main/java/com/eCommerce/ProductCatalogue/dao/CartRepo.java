package com.eCommerce.ProductCatalogue.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.ProductCatalogue.model.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart,Long> {

	
	
}
