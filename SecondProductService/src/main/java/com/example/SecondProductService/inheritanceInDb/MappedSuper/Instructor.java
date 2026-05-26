package com.example.SecondProductService.inheritanceInDb.MappedSuper;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_instructors")

public class Instructor extends User {

    private String subject;
    private double rating;
}
