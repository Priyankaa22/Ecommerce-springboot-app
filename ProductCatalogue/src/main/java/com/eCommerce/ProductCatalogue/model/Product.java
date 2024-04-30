package com.eCommerce.ProductCatalogue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String productName;
private String productDesc;
private double price;


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public double getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", productName=" + productName + ", productDesc=" + productDesc + ", price=" + price
			+ "]";
}
public Product(Long id, String productName, String productDesc, long price) {
	super();
	this.id = id;
	this.productName = productName;
	this.productDesc = productDesc;
	this.price = price;
}
public Product() {
	super();
}



}
