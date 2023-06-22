package com.example.productorder.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "orders")
public class Order {
	@Id
    private String orderId;
    private String orderDate;
    private LocalDateTime dateOfBirth;
    private String address;
    private String phoneNumber;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, String orderDate, LocalDateTime dateOfBirth, String address,
			String phoneNumber) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", phoneNumber=" + phoneNumber + "]";
	}
    

}
