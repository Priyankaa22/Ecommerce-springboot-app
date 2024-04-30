package com.eCommerce.Cart.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
	 private Long id;
	    private Long productId;
	    private int quantity;
	    private Long userId;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getProductId() {
			return productId;
		}
		public void setProductId(Long productId) {
			this.productId = productId;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public Cart(Long id, Long productId, int quantity, Long userId) {
			super();
			this.id = id;
			this.productId = productId;
			this.quantity = quantity;
			this.userId = userId;
		}
	    
	

}
