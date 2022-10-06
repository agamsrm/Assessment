package com.assessment.ProjectCRUD.service;

import java.util.List;

import com.assessment.ProjectCRUD.entity.Product;

public interface ProductService {

	public String createProduct(Product product);

	public Product updateProduct(Product product);

	public String deleteProduct(long id);

	public Product getProduct(long id);
	
	public List<Product> allproduct();

}
