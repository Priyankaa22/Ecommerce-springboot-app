package com.eCommerce.ProductCatalogue.feignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eCommerce.ProductCatalogue.model.Product;

@FeignClient(name = "product-service")

public interface ProductServiceClient {

	    @GetMapping("/api/products/{id}")
	    Product getProductById(@PathVariable Long id);
	}

