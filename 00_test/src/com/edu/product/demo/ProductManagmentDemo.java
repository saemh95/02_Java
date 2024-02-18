package com.edu.product.demo;

import com.edu.product.model.service.ProductController;
import com.edu.product.model.vo.*;

public class ProductManagmentDemo {
	 public static void main(String[] args) {
	        // Create a Product model
	        Product product = new Product("P123", "Laptop", 1200.00);

	        // Create a view to output product details to the console
	        ProductView view = new ConsoleProductView();

	        // Create a controller
	        ProductController controller = new ProductController(product, view);

	        // Initial view display
	        controller.updateView();

	        // Update product details
	        controller.setProductId("D135");
	        controller.setProductName("Gaming Laptop");
	        controller.setProductPrice(1500.00);

	        // Display updated product details
	        controller.updateView();
	        
	        controller.setProductId("F155");
	        controller.setProductName("PC");
	        controller.setProductPrice(2500.30);
	        controller.updateView();
	    }
}
