package com.stock.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.stock.model.Products;
import com.stock.model.Users;

class usersTest {

	private Users user;

	@BeforeEach
	void setUp() throws Exception {
		user = new Users("Glen", "Wangari", "wangariglen", "glen@stock.com", "123456");
	}

	@Test
	void testUsersConstructed() {
		assertEquals("Glen", user.getFirstName());
	}
	
	@Test
	void testUsersNameChanged() {
		user.setFirstName("Maina");
		assertEquals("Maina",user.getFirstName());
	}
	
	@Test
	void testEmailChanged() {
		user.setEmail("wangari@stock.com");
		assertEquals("wangari@stock.com",user.getEmail());
	}
	
	@Test
	void testPasswordChanged() {
		user.setPassword("glen123");
		assertEquals("glen123",user.getPassword());
	}


}
