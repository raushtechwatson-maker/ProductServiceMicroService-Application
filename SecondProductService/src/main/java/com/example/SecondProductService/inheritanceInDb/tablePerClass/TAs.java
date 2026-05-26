package com.example.SecondProductService.inheritanceInDb.tablePerClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_tas")
public class TAs  extends User {

    private int numberOfHrs;
    private double rating;

}
