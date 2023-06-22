package com.example.productorder.serviceinterface;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.example.productorder.entity.Order;

public interface OrderServiceInterface {
    Order createOrder(Order order);
    Order updateOrder(String orderId, Order updatedOrder);
    void deleteOrder(String orderId);
    Order getOrderById(String orderId);
    List<Order> getAllOrders();
//	List<Order> getOrdersByAddress(String address);
//	CompletableFuture<Integer> calculateAge(String orderId);

}
