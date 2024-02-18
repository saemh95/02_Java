package com.edu.product.model.service;

import com.edu.product.model.vo.Product;
import com.edu.product.model.vo.ProductView;

public class ProductController {
	private Product product;
    private ProductView view;

    public ProductController(Product product, ProductView view) {
        this.product = product;
        this.view = view;
    }

    public void setProductName(String name) {
        product.setName(name);
    }

    public void setProductPrice(double price) {
        product.setPrice(price);
    }
    
    public void setProductId(String productId) {
    	product.setProductId(productId);
    }

    public void updateView() {
        view.displayProductDetails(product);
    }
}
