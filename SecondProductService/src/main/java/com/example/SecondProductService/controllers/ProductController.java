package com.example.SecondProductService.controllers;

import com.example.SecondProductService.models.Product;
import com.example.SecondProductService.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService  productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //localhost:8080:/products/10
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) {
         Long id=productId;
        //should we call fakeStore api here  ,We should make a call to the service
        return productService.getSingleProduct(productId);
    }


    //localhost:8080:/products/
    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
    }

    //update APIS
    //updateProduct() --> patch
    //replaceProduct() --> put



}
