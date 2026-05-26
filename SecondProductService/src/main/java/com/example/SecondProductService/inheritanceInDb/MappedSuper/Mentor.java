package com.example.SecondProductService.inheritanceInDb.MappedSuper;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="msc_mentors")
public class Mentor extends User {

        private String companyName;
        private double rating;
}
