package com.assessment.ProjectCRUD.serviceimpl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.assessment.ProjectCRUD.entity.Product;
import com.assessment.ProjectCRUD.repository.ProductRepo;
import com.assessment.ProjectCRUD.utils.TestUtils;

@ExtendWith(MockitoExtension.class)
public class ServiceImplTest {

	@InjectMocks
	private ProductServiceImpl productServiceImpl;
	@Mock
	private ProductRepo productRepo;

	@Test
	public void createProduct() {
		Product prod = TestUtils.createProduct();
		Mockito.when(productRepo.save(Mockito.any(Product.class))).thenReturn(prod);
		Product productcreate = productServiceImpl.createProduct(prod);
		Assertions.assertEquals(productcreate, prod);
	}

	@Test
	public void deleteProduct() {
		Product pro = new Product();
		pro.setId(10L);
		pro.setPrice(120000);
		pro.setProduct_description("Mobile");
		pro.setProduct_name("Samsung");
		Set<Product> prod = new HashSet<Product>();
		prod.add(pro);
		// Mockito.lenient().when(productRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(pro));
		// Mockito.lenient().when(productRepo.save(Mockito.any(Product.class))).thenReturn(pro);
		Long deletedProduct = productServiceImpl.deleteProduct(10L);
		Assertions.assertEquals(deletedProduct, 10L);

	}

	@Test
	public void getProductTest() {
		Product product = TestUtils.createProduct();
		Mockito.when(productRepo.findById(Mockito.anyLong())).thenReturn(Optional.of(product));
		Product addedProduct = productServiceImpl.getProduct(10L);
		Assertions.assertEquals(addedProduct.getId(), product.getId());
	}
}
