package com.example.SecondProductService.services;

import com.example.SecondProductService.exceptions.CategoryNotFoundException;
import com.example.SecondProductService.models.Category;
import com.example.SecondProductService.models.Product;
import com.example.SecondProductService.repository.CategoryRepository;
import com.example.SecondProductService.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService{

    ProductRepository  productRepository;
    CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Product getSingleProduct(Long productId) {
//        return productRepository.findById(productId).orElseThrow(()->
//                new RuntimeException("Product with id" +productId +"doesn't exist"));

        Optional<Product> productOptional = productRepository.findById(productId);

        if(productOptional.isEmpty()){
            throw new RuntimeException(productId+"Product with id" +productId +"doesn't exist");
        }else {
            return productOptional.get();
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) throws CategoryNotFoundException {
        Category category = product.getCategory();
        if (category == null) {
            throw new CategoryNotFoundException("Category is required for creating a product");
        }

        //Find the category with the title
        Optional<Category> categoryOptional = categoryRepository.findByTitle(category.getTitle());

        if (categoryOptional.isEmpty()) {
            // Save new category
            category = categoryRepository.save(category);
        } else {
            // USE EXISTING CATEGORY (THIS LINE IS MISSING)
            category = categoryOptional.get();
        }

        product.setCategory(category);
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
