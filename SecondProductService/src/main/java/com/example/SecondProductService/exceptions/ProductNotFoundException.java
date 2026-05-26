package com.example.SecondProductService.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String message) {
        super(message);
    }


    private Long productId;

    public ProductNotFoundException(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

}
