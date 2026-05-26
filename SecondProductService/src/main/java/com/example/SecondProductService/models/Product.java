package com.example.SecondProductService.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "products")

public class Product extends BaseModel {
   private String name;
   private String description;
   private String image;
   private Double price;

   @ManyToOne
   private Category category;

}
