package com.example.SecondProductService.controlleradvices;

import com.example.SecondProductService.dtos.ExceptionDto;
import com.example.SecondProductService.dtos.ProductNotFoundExceptionDto;
import com.example.SecondProductService.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductserviceExceptionHandler {

    //1.
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionDto> handleRuntimeExecption(){


        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("An error occurred while processing your request.");
        exceptionDto.setResolutionDetails("You have to pay the money for this month to use this service !  Thanks....");

        return new  ResponseEntity<>(
                //"Please try again later.",
                exceptionDto,
                HttpStatus.UNAUTHORIZED);

    }


    //2.
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundExceptionDto>  handleProductNotFoundException(ProductNotFoundException exception){
        ProductNotFoundExceptionDto exceptionDto = new ProductNotFoundExceptionDto();
        exceptionDto.setMessage("Product not found.");
        exceptionDto.setResolution("Please try again with valid product id");
        exceptionDto.setProductId(exception.getProductId());

        return new  ResponseEntity<>(
                //"Please try again later.",
                exceptionDto,
                HttpStatus.NOT_FOUND);

    }
}
