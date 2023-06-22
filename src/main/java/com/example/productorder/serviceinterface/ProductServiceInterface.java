package com.example.productorder.serviceinterface;

import java.util.List;

import com.example.productorder.entity.Product;

public interface ProductServiceInterface {
    Product createProduct(Product product);
    Product updateProduct(String productId, Product updatedProduct);
    void deleteProduct(String productId);
    Product getProductById(String productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCurrency(String currency);
}
