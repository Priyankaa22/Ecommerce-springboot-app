package com.eCommerce.Checkout;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eCommerce.Cart.model.Cart;
import com.eCommerce.Cart.service.CartService;
import com.eCommerce.ProductCatalogue.feignClient.ProductServiceClient;
import com.eCommerce.ProductCatalogue.model.Product;

public class CheckOutService {
	@Autowired
    private CartService cartService;

    @Autowired
    private ProductServiceClient productServiceClient;

    public double getTotalPrice(Long userId) {
        List<Cart> cart = cartService.getUserCart(userId);
        double totalPrice = 0.0;
        for (Cart cartItem : cart) {
            Product product = productServiceClient.getProductById(cartItem.getProductId());
            if (product != null) {
                totalPrice += product.getPrice() * cartItem.getQuantity();
            }
        }
        return totalPrice;
    }

    public void placeOrder(Long userId) {
    	List<Cart> cart = cartService.getUserCart(userId);
        for (Cart cartItem : cart) {
            // Decrease product quantity in inventory or mark as sold
        }
        cart.forEach(cartItem -> cartService.removeFromCart(cartItem.getId()));
    }
}



