package com.eCommerce.ProductCatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.ProductCatalogue.dao.ProductRepo;
import com.eCommerce.ProductCatalogue.exception.ResourceNotFoundException;
import com.eCommerce.ProductCatalogue.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepository;
	

	public ProductService(ProductRepo prodRepo) {
		this.productRepository = productRepository;
	}


	public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}