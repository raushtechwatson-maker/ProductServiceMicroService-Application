package com.example.SecondProductService.services;

import com.example.SecondProductService.models.Product;
import com.example.SecondProductService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    ProductRepository  productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product getSingleProduct(Long productId) {
        return productRepository.findById(productId).orElseThrow(()->
                new RuntimeException("Product with id" +productId +"doesn't exist"));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
