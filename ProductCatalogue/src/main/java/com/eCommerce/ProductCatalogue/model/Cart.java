package com.eCommerce.ProductCatalogue.model;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Long cartItemId;
	 private int quantity;
	 
	 @Transient
	 private double totalPrice;
	    @ManyToOne
	    @JoinColumn(name = "product_id", referencedColumnName = "id")
	    private Product product;
	   
		
	    public double getTotalPrice() {
	    	if (product != null) {
	            return product.getPrice() * getQuantity();
	        }
	        return 0.0;
	    }
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
	
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public Long getCartItemId() {
			return cartItemId;
		}
		public void setCartItemId(Long cartItemId) {
			this.cartItemId = cartItemId;
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		
		public Cart(Long cartItemId, int quantity, double totalPrice, Product product) {
			super();
			this.cartItemId = cartItemId;
			this.quantity = quantity;
			this.totalPrice = totalPrice;
			this.product = product;
			
		}
		public Cart() {
			super();
		}
	
	

}
