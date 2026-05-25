package com.example.SecondProductService.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends BaseModel {
   private String name;
   private String description;
   private String image;
   private Double price;
   private Category category;

}
