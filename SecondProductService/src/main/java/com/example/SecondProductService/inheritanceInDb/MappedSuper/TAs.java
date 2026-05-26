package com.example.SecondProductService.inheritanceInDb.MappedSuper;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_tas")
public class TAs  extends User{

    private int numberOfHrs;
    private double rating;

}
