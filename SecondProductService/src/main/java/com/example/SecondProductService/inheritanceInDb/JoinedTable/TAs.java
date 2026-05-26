package com.example.SecondProductService.inheritanceInDb.JoinedTable;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class TAs  extends User {

    private int numberOfHrs;
    private double rating;

}
