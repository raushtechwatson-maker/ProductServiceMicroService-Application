package com.example.SecondProductService.dtos;

import com.example.SecondProductService.models.Category;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String name;
    private String description;
    private String image;
    private Double price;
    private String category;
}
