package com.example.SecondProductService.controllers;

import com.example.SecondProductService.dtos.ExceptionDto;
import com.example.SecondProductService.dtos.ProductNotFoundExceptionDto;
import com.example.SecondProductService.exceptions.CategoryNotFoundException;
import com.example.SecondProductService.models.Product;
import com.example.SecondProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService  productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    //localhost:8080:/products/10
    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("id") Long productId) {

        //ResponseEntity<Product> responseEntity = null;

        ResponseEntity<Product> responseEntity = new ResponseEntity<>(
                 productService.getSingleProduct(productId)
                , HttpStatus.OK
        );

         //throw new RuntimeException("Something went wrong");
        //should we call fakeStore api here  ,We should make a call to the service
//        try {
//            Product product = productService.getSingleProduct(productId);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//        } catch (Exception e) {
//            //log the exception
//            e.printStackTrace();
//            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        return responseEntity;
    }


    //localhost:8080:/products/
    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) throws CategoryNotFoundException {
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
    }

    //update APIS
    //updateProduct() --> patch
    //replaceProduct() --> put

//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<ExceptionDto> handleRunTimeException() {
//        ExceptionDto exceptionDto = new ExceptionDto();
//        exceptionDto.setMessage("Handling exception within the controller");
//
//        return new ResponseEntity<>(
//                exceptionDto,
//                HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}
