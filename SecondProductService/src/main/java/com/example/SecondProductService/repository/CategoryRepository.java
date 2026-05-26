package com.example.SecondProductService.repository;

import com.example.SecondProductService.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {

       Optional<Category>  findByTitle(String name);




}
