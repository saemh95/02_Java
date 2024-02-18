package com.edu.product.model.vo;

public class Product {

	private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public void setName (String name) {
    	this.name = name;
    }
    
    public void setPrice (double price) {
    	this.price = price;
    }
    public void setProductId(String productId) {
    	this.productId = productId;
    }
}
