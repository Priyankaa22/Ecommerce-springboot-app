package com.eCommerce.ProductCatalogue.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.ProductCatalogue.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

}
