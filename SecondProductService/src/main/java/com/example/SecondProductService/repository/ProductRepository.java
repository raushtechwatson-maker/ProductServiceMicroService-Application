package com.example.SecondProductService.repository;

import com.example.SecondProductService.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    //Select * from Product where id = ?
    @Override
    Optional<Product> findById(Long productId);


    @Override
    List<Product> findAll();


//    Optional<List<Product>> findByTitleContainsIgnoreCase(String title);


    //            productRepository.save(product);        // insert/update
//            productRepository.findById(1L);         // get by id
//            productRepository.findAll();            // get all
//            productRepository.deleteById(1L);       // delete
//            productRepository.count();              // count rows
//            productRepository.existsById(1L);       // check existence
}
