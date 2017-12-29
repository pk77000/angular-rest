package com.example.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Product;

@RestController
@RequestMapping("api/v1/")
public class ProductController {

	@CrossOrigin(origins="http://localhost:8808")
	@RequestMapping(value="product",method=RequestMethod.GET)
	public List<Product> getProductList(){
		
		Product product = new Product();
		
		product.setDescription("Shampoo");
		product.setImageUrl("XYZ");
		product.setPrice(2000);
		product.setProductCode("XYZ");
		product.setProductName("L'oreal");
		product.setReleaseDate("XYZ");
		product.setReleaseDate("XYZ");
		product.setStarRating(5);
		
		
		LinkedList<Product> products = new LinkedList<>();
		
		products .add(product);
		return products;
	}
	
}
