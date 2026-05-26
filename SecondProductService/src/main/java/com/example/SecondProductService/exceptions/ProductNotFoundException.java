package com.example.SecondProductService.exceptions;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductNotFoundException extends RuntimeException {
    private Long productId;
    public ProductNotFoundException(String message) {
        super(message);
    }


    public ProductNotFoundException(    String message, Long productId) {
        super(message);
        this.productId = productId;
    }

}
