package com.example.SecondProductService;

import com.example.SecondProductService.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SecondProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondProductServiceApplication.class, args);

        //Generics concept
//        List<Product> products = new ArrayList<>();
//        List<String> productNames = new ArrayList<>();
//        List<Integer>  ids = new ArrayList<>();
//        List list = new ArrayList();
//
//        System.out.println("Debug");

        //At runtime Everything become Objects.
	}
}
