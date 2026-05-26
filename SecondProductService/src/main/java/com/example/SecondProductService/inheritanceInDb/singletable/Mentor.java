package com.example.SecondProductService.inheritanceInDb.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_mentors")
@DiscriminatorValue(value = "2")
public class Mentor extends User {

        private String companyName;
        private double rating;
}
