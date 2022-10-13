package com.assessment.ProjectCRUD.utils;

import java.util.HashSet;
import java.util.Set;

import com.assessment.ProjectCRUD.entity.Product;

public class TestUtils {

	public static Product createProduct() {
		Product pro = new Product();
		pro.setId(10);
		pro.setPrice(120000);
		pro.setProduct_description("Mobile");
		pro.setProduct_name("Samsung");
		Set<Product> prod = new HashSet<Product>();
		prod.add(pro);
		return pro;
	}

}
