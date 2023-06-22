package com.example.productorder.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productorder.entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, String>{

}
