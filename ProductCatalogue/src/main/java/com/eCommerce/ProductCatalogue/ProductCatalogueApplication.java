package com.eCommerce.ProductCatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class ProductCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}

}
