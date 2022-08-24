package com.stock.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.stock.model.Products;

class productsTest {

	private Products product;

	@BeforeEach
	void setUp() throws Exception {
		product = new Products("Powerbank", "Electronics", "15");
	}

	@Test
	void testProductConstructed() {
		assertEquals("Powerbank", product.getProductName());
	}
	
	@Test
	void testProductsNameChanged() {
		product.setProductName("Macbook");
		assertEquals("Macbook",product.getProductName());
	}
	
	@Test
	void testProductsCategoryChanged() {
		product.setProductCategory("computers");;
		assertEquals("computers",product.getProductCategory());
	}
	
	@Test
	void testProductsPriceChanged() {
		product.setProductPrice("800");;
		assertEquals("800",product.getProductPrice());
	}

}
