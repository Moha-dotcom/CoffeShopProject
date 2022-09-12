package com.example.coffeshop.Entity.Product;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table ( name = "PRODUCT" )
@Transactional
public class Product {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private int product_id;
    private int product_number;
    private String product_description;
    private String product_type;
    private String product_items;
    private int product_customer_id;

    public Product (int product_id, int product_number, String product_description, String product_type, String product_items, int product_customer_id) {
        this.product_id = product_id;
        this.product_number = product_number;
        this.product_description = product_description;
        this.product_type = product_type;
        this.product_items = product_items;
        this.product_customer_id = product_customer_id;
    }

    public Product() {
    }

    public int getProduct_id () {
        return product_id;
    }

    public void setProduct_id (int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_number () {
        return product_number;
    }

    public void setProduct_number (int product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description () {
        return product_description;
    }

    public void setProduct_description (String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_type () {
        return product_type;
    }

    public void setProduct_type (String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_items () {
        return product_items;
    }

    public void setProduct_items (String product_items) {
        this.product_items = product_items;
    }

    public int getProduct_customer_id () {
        return product_customer_id;
    }

    public void setProduct_customer_id (int product_customer_id) {
        this.product_customer_id = product_customer_id;
    }
}
