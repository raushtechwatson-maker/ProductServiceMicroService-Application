package com.example.SecondProductService.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {


    //http://<domain_name>/Sample/sayHello
    //API --function
    @GetMapping("/sayHello/{name}")
    public String Sample(@PathVariable("name")  String name) {
        return "Hello " + name;
    }


    //http://<domain_name>/Sample/sayHello2
    @GetMapping("/sayHello2")
    public String Sample2(@RequestParam("x") int x) {
        StringBuilder stringBuilder = new StringBuilder(" ");
        for (int i=1;i<=x;i++) {
            stringBuilder.append("Hello World<br>");
        }
        return stringBuilder.toString();
    }
}



//http://amazon.com/orders/create
//http:LocalHost:8080/sample/sayHello :192.168.1.7
//ProductController - /products
//UserController - /users
//CategoryController - /categories


//HandlerMapping (maintained by Springframework)
//sample -Samplecontroller
//product -ProductController
//category -CategoryController


