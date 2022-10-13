package com.assessment.ProjectCRUD.service;

import java.util.List;

import com.assessment.ProjectCRUD.entity.Product;

public interface ProductService {

	public Product createProduct(Product product);

	public Product updateProduct(Product product);

	public Long deleteProduct(long id);

	public Product getProduct(long id);
	
	public List<Product> allproduct();

}
