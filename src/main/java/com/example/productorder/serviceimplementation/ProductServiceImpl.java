package com.example.productorder.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productorder.Repository.ProductRepository;
import com.example.productorder.entity.Product;
import com.example.productorder.serviceinterface.ProductServiceInterface;

@Service
public class ProductServiceImpl implements ProductServiceInterface {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(String productId, Product updatedProduct) {
		Product product = productRepository.findById(productId)
				.orElseThrow(() -> new IllegalArgumentException("Product not found"));

		product.setProductName(updatedProduct.getProductName());
		product.setDescription(updatedProduct.getDescription());
		product.setPrice(updatedProduct.getPrice());
		product.setCurrency(updatedProduct.getCurrency());

		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(String productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Product getProductById(String productId) {
		return productRepository.findById(productId)
				.orElseThrow(() -> new IllegalArgumentException("Product not found"));
	}

	@Override
	public List<Product> getAllProducts() {
		return StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public List<Product> getProductsByCurrency(String currency) {
		return StreamSupport.stream(productRepository.findAll().spliterator(), false)
				.filter(product -> product.getCurrency().equals(currency)).collect(Collectors.toList());
	}
}
