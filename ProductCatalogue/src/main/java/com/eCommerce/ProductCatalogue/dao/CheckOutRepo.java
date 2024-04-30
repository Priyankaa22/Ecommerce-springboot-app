package com.eCommerce.ProductCatalogue.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.ProductCatalogue.model.CheckOut;

@Repository
public interface CheckOutRepo extends JpaRepository<CheckOut,Long> {

}
