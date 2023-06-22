package com.example.productorder.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productorder.entity.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

}
