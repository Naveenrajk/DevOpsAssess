package com.rts.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rts.evaluation.dao.CustomerDAO;
import com.rts.evaluation.pojo.Customer;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/customerRest/api")
public class CustomerController {
	@Autowired
	CustomerDAO dao;

	@PostMapping("/customers")
	public void performInsert(@RequestBody Customer bean) {
		dao.insert(bean);
		System.out.println("Customer Record Inserted!");
		List<Customer> list = dao.view();
		System.out.println(list);
	}

}
