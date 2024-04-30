package com.eCommerce.ProductCatalogue.model;


import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;


@Entity
public class CheckOut {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long checkoutId;
private LocalDate dateCreated;
private String status;
private double totalPrice;


@OneToMany( cascade = CascadeType.ALL)
private List<Cart> carts;


public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}


public long getCheckoutId() {
	return checkoutId;
}


public void setCheckoutId(long checkoutId) {
	this.checkoutId = checkoutId;
}


public LocalDate getDateCreated() {
	return dateCreated;
}


public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public List<Cart> getCarts() {
	return carts;
}


public void setCarts(List<Cart> carts) {
	this.carts = carts;
}

public double getTotalPrice() {
	 return totalPrice;
}




public CheckOut(long checkoutId, LocalDate dateCreated, String status, double totalPrice, List<Cart> carts) {
	super();
	this.checkoutId = checkoutId;
	this.dateCreated = dateCreated;
	this.status = status;
	this.totalPrice = totalPrice;
	this.carts = carts;
}


public CheckOut() {
	super();
}




}