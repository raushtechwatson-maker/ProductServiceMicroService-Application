package com.example.SecondProductService.inheritanceInDb.singletable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_instructors")
@DiscriminatorValue(value = "3")
public class Instructor extends User {

    private String subject;
    private double rating;
}
