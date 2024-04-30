package com.eCommerce.ProductCatalogue.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.ProductCatalogue.dao.CheckOutRepo;

import com.eCommerce.ProductCatalogue.model.CheckOut;

@Service
public class CheckOutService {
	

	@Autowired 
	private CheckOutRepo checkOutRepository;
	
	
	public CheckOutService(CheckOutRepo checkOutRepository) {
		super();
		this.checkOutRepository = checkOutRepository;
	}

	public Optional<CheckOut> getCheckoutDetails(Long checkoutId) {
		// TODO Auto-generated method stub
		return checkOutRepository.findById(checkoutId) ;
	}

	public CheckOut placeOrder(CheckOut checkOut) {
		// TODO Auto-generated method stub
		return checkOutRepository.save(checkOut);
	}
	 


}



