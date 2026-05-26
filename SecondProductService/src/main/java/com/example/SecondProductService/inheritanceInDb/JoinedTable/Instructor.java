package com.example.SecondProductService.inheritanceInDb.JoinedTable;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_instructors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User {

    private String subject;
    private double rating;
}
