package com.rts.evaluation;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rts.evaluation.controller.CustomerController;
import com.rts.evaluation.dao.CustomerDAO;
import com.rts.evaluation.pojo.Customer;

@SpringBootApplication
public class SpringBootRestApplication {

	static CustomerDAO dao = new CustomerDAO();

	public Customer menu() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Customer Id, FName, LName, Age and City : ");

		return new Customer(101, "Naveen", "Raj", 22, "London");
		//return new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);

		SpringBootRestApplication obj = new SpringBootRestApplication();

		Customer bean = obj.menu();

		CustomerController control = new CustomerController();
		control.performInsert(bean);
		
	}

}
