package com.example.coffeshop.RestController;


import com.example.coffeshop.Entity.Product.Product;
import com.example.coffeshop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService service;



    @GetMapping("/product/{product_id}")
    public Optional<Product> getProduct(@PathVariable  Integer product_id){

        return Optional.ofNullable (service.findProduct (product_id));
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
         service.saveProduct (product);
    }

    @PutMapping("/product/{product_id}")
    public void UpdateProduct(@RequestBody Product product, @PathVariable int product_id){
        service.UpdateProduct (product, product_id);
    }

    @DeleteMapping("/product/{product_id}")
    public  void deleteProductById(@PathVariable int product_id){
        service.removeProduct (product_id);
    }
}
