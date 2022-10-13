package com.assessment.ProjectCRUD.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.ProjectCRUD.entity.Product;
import com.assessment.ProjectCRUD.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductControl {
	@Autowired
	ProductService productservice;
    
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/product")
	public Product addproduct(@Valid @RequestBody Product product) {
		return productservice.createProduct(product);
	}

	@GetMapping("/product/{id}")
	Product getProduct(@PathVariable("id") long id) {
		return productservice.getProduct(id);

	}
	
	@GetMapping("/products")
	public List<Product> allProduct()
	{
		return productservice.allproduct();
	}

	@DeleteMapping("/product/{id}")
	Long DeleteProduct(@PathVariable("id") long id) {
		return productservice.deleteProduct(id);
	}

	@PutMapping("/product")
	Product updateProduct(@Valid @RequestBody Product product) {
		return productservice.updateProduct(product);
	}
}
