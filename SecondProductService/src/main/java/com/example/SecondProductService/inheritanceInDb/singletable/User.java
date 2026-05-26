package com.example.SecondProductService.inheritanceInDb.singletable;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_users")
@Inheritance(strategy = jakarta.persistence.InheritanceType.SINGLE_TABLE)
public class User {
    @Id
    private Long id;
    private String name;
    private String email;

}
