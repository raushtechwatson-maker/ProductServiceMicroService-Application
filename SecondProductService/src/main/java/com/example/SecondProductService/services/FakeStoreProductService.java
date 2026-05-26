package com.example.SecondProductService.services;

import com.example.SecondProductService.dtos.FakeStoreProductDto;
import com.example.SecondProductService.exceptions.ProductNotFoundException;
import com.example.SecondProductService.models.Category;
import com.example.SecondProductService.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.smartcardio.CardTerminal;
import java.util.ArrayList;
import java.util.List;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    //Note: This service class will implement all the apis using fakestore
    RestTemplate restTemplate;
        public FakeStoreProductService(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }


    @Override
    public Product getSingleProduct(Long productId) {
           //throw new RuntimeException("Something went wrong");

        ResponseEntity<FakeStoreProductDto> fakeStoreProductDtoResponseEntity=restTemplate.
                getForEntity("https://fakestoreapi.com/products/"
                + productId, FakeStoreProductDto.class);

        FakeStoreProductDto fakeStoreProductDto=fakeStoreProductDtoResponseEntity.getBody();

        if (fakeStoreProductDto==null){
            throw new ProductNotFoundException(productId+"Products with id" +productId +"doesn't exist" );
        }


        //convert fakeStoreProductDto into product object and return it
        Product product = convertFakeStoreProductDtoIntoProduct(fakeStoreProductDto);
        return product;
    }

    @Override
    public List<Product> getAllProducts() {

        ResponseEntity<FakeStoreProductDto[]> fakeStoreProductDtosResponse =restTemplate.
                getForEntity("https://fakestoreapi.com/products/",
                        FakeStoreProductDto[].class);

        FakeStoreProductDto[] fakeStoreProductDtos = fakeStoreProductDtosResponse.getBody();

        List<Product> products = new ArrayList<>();
        for (FakeStoreProductDto fakeStoreProductDTO : fakeStoreProductDtos) {
            products.add(convertFakeStoreProductDtoIntoProduct(fakeStoreProductDTO));
        }
         return products;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }


    private static Product convertFakeStoreProductDtoIntoProduct(FakeStoreProductDto fakeStoreProductDto){

            if (fakeStoreProductDto==null){
                return null;
            }

        Product product=new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setName(fakeStoreProductDto.getName());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        product.setPrice(fakeStoreProductDto.getPrice());

        Category category = new  Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;
    }


//    public void test(){
//        ProductService.fun3();  // ✅ correct
//    }
//
//
//    @Override
//    public void fun() {
//        ProductService.super.fun();
//        System.out.println("fun");
//    }
}
