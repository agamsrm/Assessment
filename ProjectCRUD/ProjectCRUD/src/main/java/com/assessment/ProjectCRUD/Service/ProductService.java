package com.assessment.ProjectCRUD.Service;

import org.springframework.stereotype.Service;

import com.assessment.ProjectCRUD.Entity.Product;

@Service
public interface ProductService {

	public String createProduct(Product product);

	public Product updateProduct(Product product);

	public String deleteProduct(long id);

	public Product getProduct(long id);

}
