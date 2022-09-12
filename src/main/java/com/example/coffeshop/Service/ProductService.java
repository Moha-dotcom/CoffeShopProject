package com.example.coffeshop.Service;


import com.example.coffeshop.Entity.Product.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

   Product findProduct(int product_id);
   void saveProduct(Product product);
   void removeProduct(int product_id);

   void UpdateProduct(Product product, int product_id);



}
