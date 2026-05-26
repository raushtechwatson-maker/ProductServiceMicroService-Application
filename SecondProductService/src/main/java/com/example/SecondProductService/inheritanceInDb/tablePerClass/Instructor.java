package com.example.SecondProductService.inheritanceInDb.tablePerClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_instructors")
public class Instructor extends User {

    private String subject;
    private double rating;
}
