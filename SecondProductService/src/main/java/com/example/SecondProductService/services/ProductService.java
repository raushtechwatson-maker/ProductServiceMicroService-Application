package com.example.SecondProductService.services;

import com.example.SecondProductService.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface ProductService {
    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Product createProduct( Product product);

     boolean deleteProduct(Long productId);

//     default void fun(){
//         System.out.println("fun");
//         fun2();
//     }
//
//     private void fun2(){
//         System.out.println("fun2");
//     }
//
//     static void fun3(){
//         System.out.println("fun3");
//     }
}
