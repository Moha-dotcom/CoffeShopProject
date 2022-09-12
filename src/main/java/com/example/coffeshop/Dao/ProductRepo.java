package com.example.coffeshop.Dao;


import com.example.coffeshop.Entity.Product.Product;

public interface ProductRepo {
    public Product findProduct(int product_id);
    public void AddProduct(Product product);
    public void deleteProduct(int product_id);
    public void updateProduct(Product product, int product_id);

}
