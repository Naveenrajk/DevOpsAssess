package com.rts.evaluation;

import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rts.evaluation.dao.CustomerDAO;
import com.rts.evaluation.pojo.Customer;

@SpringBootTest
class SpringBootRestApplicationTests {

	@Autowired
	static CustomerDAO dao;
	Customer bean = new Customer(201, "John", "Doe", 11, "London");

	@Test
	void contextLoads() {
	}

	@Test
	public void testPerformInsert() {
		dao = new CustomerDAO();
		boolean value = dao.insert(bean);
		assertEquals(value, true);
	}

}
