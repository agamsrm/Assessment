package com.assessment.ProjectCRUD.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.ProjectCRUD.entity.Product;
import com.assessment.ProjectCRUD.repository.ProductRepo;
import com.assessment.ProjectCRUD.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepo productrepo;

	@Override
	public String createProduct(Product product) {
		// TODO Auto-generated method stub

		productrepo.save(product);
		return "Product "+product.getId()+" Has Been Added Successfully";

	}

	@Override
	public Product getProduct(long id) {
		// TODO Auto-generated method stub

		return productrepo.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		productrepo.save(product);
		return productrepo.findById(product.getId()).get();
	}

	@Override
	public String deleteProduct(long id) {
		// TODO Auto-generated method stub
		productrepo.deleteById(id);
		return "Data "+id+" Has Been Deleted Successfully";
	}

	@Override
	public List<Product> allproduct() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

}
