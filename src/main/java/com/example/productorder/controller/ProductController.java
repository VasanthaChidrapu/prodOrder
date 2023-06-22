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

import com.example.productorder.entity.Product;
import com.example.productorder.serviceinterface.ProductServiceInterface;
@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductServiceInterface productServiceInterface;
	@PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productServiceInterface.createProduct(product);
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable String productId, @RequestBody Product updatedProduct) {
        return productServiceInterface.updateProduct(productId, updatedProduct);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable String productId) {
    	productServiceInterface.deleteProduct(productId);
    }
    
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId) {
        return productServiceInterface.getProductById(productId);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productServiceInterface.getAllProducts();
    }

    @GetMapping("/byCurrency/{currency}")
    public List<Product> getProductsByCurrency(@PathVariable String currency) {
        return productServiceInterface.getProductsByCurrency(currency);
    }

}
