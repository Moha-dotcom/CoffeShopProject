package com.example.coffeshop.Dao;


import com.example.coffeshop.Entity.Product.Product;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;
import java.util.logging.Logger;

@Repository
@Transactional
public class ProductRepoImpl  implements ProductRepo{


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Product findProduct (int product_id) {
        return entityManager.find(Product.class, product_id);
    }

    @Override
    public void AddProduct (Product product) {
        entityManager.persist (product);
    }

    @Override
    public void deleteProduct (int product_id) {
        Optional<Product> product = Optional.ofNullable (findProduct (product_id));

        if(product.isPresent ()){
            entityManager.remove (product);

        }
    }


    @Override
    public void updateProduct (Product product , int product_id) {
       entityManager.merge (product);

    }
}
