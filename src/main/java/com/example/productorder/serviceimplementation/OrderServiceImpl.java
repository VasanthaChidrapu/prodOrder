package com.example.productorder.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productorder.Repository.OrderRepository;
import com.example.productorder.entity.Order;
import com.example.productorder.serviceinterface.OrderServiceInterface;
@Service
public class OrderServiceImpl implements OrderServiceInterface{
	@Autowired
	private OrderRepository orderRepository;
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(String orderId, Order updatedOrder) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Order not found"));

        order.setOrderDate(updatedOrder.getOrderDate());
        order.setDateOfBirth(updatedOrder.getDateOfBirth());
        order.setAddress(updatedOrder.getAddress());
        order.setPhoneNumber(updatedOrder.getPhoneNumber());

        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(String orderId) {
        orderRepository.deleteById(orderId);
    }

    @Override
    public Order getOrderById(String orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Order not found"));
    }

    @Override
    public List<Order> getAllOrders() {
        return StreamSupport.stream(orderRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
//    @Override
//    public List<Order> getOrdersByAddress(String address) {
//        return orderRepository.findByAddress(address);
//    }
//
//    @Override
//    public CompletableFuture<Integer> calculateAge(String orderId) {
//        return CompletableFuture.supplyAsync(() -> {
//            Order order = getOrderById(orderId);
//            return order.calculateAge();
//        });
//    }
}
