package com.example.productorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productorder.entity.Order;
import com.example.productorder.serviceinterface.OrderServiceInterface;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderServiceInterface orderServiceInterface;
	
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderServiceInterface.createOrder(order);
    }

    @PutMapping("/{orderId}")
    public Order updateOrder(@PathVariable String orderId, @RequestBody Order updatedOrder) {
        return orderServiceInterface.updateOrder(orderId, updatedOrder);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable String orderId) {
    	orderServiceInterface.deleteOrder(orderId);
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable String orderId) {
        return orderServiceInterface.getOrderById(orderId);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderServiceInterface.getAllOrders();
    }

//    @GetMapping("/byAddress/{address}")
//    public List<Order> getOrdersByAddress(@PathVariable String address) {
//        return orderServiceInterface.getOrdersByAddress(address);
//    }
//
//    @GetMapping("/{orderId}/calculateAge")
//    public CompletableFuture<Integer> calculateAge(@PathVariable String orderId) {
//        return orderServiceInterface.calculateAge(orderId);
//    }

}
