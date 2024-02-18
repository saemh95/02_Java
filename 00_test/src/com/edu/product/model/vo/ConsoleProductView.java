package com.edu.product.model.vo;

public class ConsoleProductView implements ProductView {
	
    @Override
    public void displayProductDetails(Product product) {
        System.out.println("Product Details:");
        System.out.println("ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
    }
}

