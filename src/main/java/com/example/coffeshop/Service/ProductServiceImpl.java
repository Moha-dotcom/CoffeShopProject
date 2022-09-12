package com.example.coffeshop.Service;

import com.example.coffeshop.Dao.ProductRepoImpl;
import com.example.coffeshop.Entity.Product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepoImpl repo;


    @Override
    public Product findProduct (int product_id) {
        return repo.findProduct (product_id);

    }

    @Override
    public void saveProduct (Product product) {
        repo.AddProduct (product);

    }

    @Override
    public void removeProduct (int product_id) {
        repo.deleteProduct (product_id);
    }

    @Override
    public void UpdateProduct (Product product, int product_id) {
        repo.updateProduct (product, product_id);
    }
}
