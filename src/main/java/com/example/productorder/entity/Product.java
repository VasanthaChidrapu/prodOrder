package com.example.productorder.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Product {
	  @Id
	 // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    private String productName;
    private LocalDateTime description;
    private Double price;
    private String currency;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String productName, LocalDateTime description, Double price, String currency) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.currency = currency;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDateTime getDescription() {
		return description;
	}
	public void setDescription(LocalDateTime description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", currency=" + currency + "]";
	}
    

}
