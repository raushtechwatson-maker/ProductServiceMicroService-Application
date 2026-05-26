package com.example.SecondProductService.inheritanceInDb.singletable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_tas")
@DiscriminatorValue(value = "1")
public class TAs  extends User {

    private int numberOfHrs;
    private double rating;

}
